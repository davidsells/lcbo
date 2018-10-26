package com.davidsells.controllers;

import java.util.List;
import java.util.Map;

import com.davidsells.models.Product.Product;
import com.davidsells.models.selection.Wine;
import com.davidsells.models.selection.WineRequest;
import com.davidsells.services.LCBOServiceImpl;
import com.davidsells.services.UserProfileSearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class WelcomeController {
    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @Autowired
    private LCBOServiceImpl lcboService;

    @Autowired
    private UserProfileSearchServiceImpl userProfileSearchService;

    @Autowired
    private HttpSession httpSession;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    private final WineRequest retrieveOrCreateSessionObject(final String user) {
        String attributeName = user.trim()+"_winerequest";
        WineRequest wineRequest = (WineRequest) httpSession.getAttribute(attributeName);

        if (wineRequest == null )  {
            Map<String, Map<String, List<Wine>>> wines =  userProfileSearchService.getWinesForUser(user);
            wineRequest = new WineRequest(user,wines);
            httpSession.setAttribute(attributeName, wineRequest);
        }
        return wineRequest;
    }

    // We will trust that the price has respected the limited offers end date.
    private Integer getPrice(final Product wine) {
        return wine.getPrice_in_cents();
    }

    private Boolean isInStock(final Wine wine) {
         Integer stock = lcboService.getInventoryOfProductAtStore(userProfileSearchService.getStoreNumber(), wine.getProductNumber());
         return stock > 0;
    }

    private Wine findWineInStock(WineRequest wineRequest) {
        Wine wine = null;
        int count=0;
        do {
            wine = wineRequest.getNextWine(count);
            count++;
        } while(wine!=null &&!isInStock(wine));
        wineRequest.acceptWineSelection(wine);
        return wine;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String requestRecommendations(@RequestParam(name = "user", required = false, defaultValue = "bob") String user, Map<String,Object> model) {
        if ((user != null) && (user.trim().length() > 0)) {
            WineRequest wineRequest = retrieveOrCreateSessionObject(user);
            Wine wine = findWineInStock(wineRequest);
            model.put("user",user);
            model.put("wine",wine);
        }

        return "welcome";
    }

}