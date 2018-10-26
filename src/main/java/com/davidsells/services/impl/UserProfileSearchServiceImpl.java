package com.davidsells.services.impl;

import com.davidsells.models.Product.Product;
import com.davidsells.models.Store.Store;
import com.davidsells.models.selection.Wine;
import com.davidsells.services.LCBOService;
import com.davidsells.services.UserProfileSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserProfileSearchServiceImpl implements UserProfileSearchService {


    private Logger logger = LoggerFactory.getLogger(UserProfileSearchServiceImpl.class);
    Map<String, PriceInequality> userProfiles;
    private List<Wine> redWines = null;
    private List<Wine> whiteWines = null;
    private Integer storeNumber;

    @Autowired
    private LCBOService lcboService;

    @Override
    public Map<String, Map<String, List<Wine>>> getWinesForUser(String userName) {
        PriceInequality priceInequality = userProfiles.get(userName.toLowerCase());
        Map<String, Map<String, List<Wine>>> selectedWines = new HashMap<>();
        if (priceInequality == null) {
            logger.error("Do not know user.");
        } else {

            Map<String, List<Wine>> redWinesGroupedByProducer = getWinesBasedOnTypeAndPriceGroupedByProducers(redWines, priceInequality);
            Map<String, List<Wine>> whiteWinesGroupedByProducer = getWinesBasedOnTypeAndPriceGroupedByProducers(whiteWines, priceInequality);
            selectedWines.put("white", whiteWinesGroupedByProducer);
            selectedWines.put("red", redWinesGroupedByProducer);
        }
        return selectedWines;
    }

    @Override
    public Integer getStoreNumber() {
        return storeNumber;
    }


    private String getOrigin(final Product wine) {
        String origin = wine.getOrigin();
        if (origin == null || origin.trim().length() == 0) {
            origin = "Unknown";
        } else {
            int separatorIndex = origin.indexOf(',');
            if (separatorIndex > 0) {
                origin = origin.substring(0, separatorIndex);
            }
        }
        return origin;
    }

    private Wine extractWine(final Product product, final String type) {
        Boolean isOnSale = product.getRegular_price_in_cents() != product.getPrice_in_cents();
        Float a = new Float(100);
        Float price = product.getPrice_in_cents() / a;
        return new Wine(
                product.getProduct_no()
                , product.getName()
                , getOrigin(product)
                , product.getProducer_name()
                , product.getPrice_in_cents()
                , price
                , product.getReleased_on()
                , product.getVarietal(), type, isOnSale);
    }

    private Map<String, List<Wine>> groupWinesByProducers(final List<Wine> wines) {
        // Group By Producers
        return wines.stream().collect(Collectors.groupingBy(Wine::getProducer));
    }


    private Map<String, List<Wine>> getWinesBasedOnTypeAndPriceGroupedByProducers(final List<Wine> wines, final PriceInequality priceInequality) {
        List<Wine> filteredRedWines = filterWinesBasedOnPrice(wines, priceInequality);
        return groupWinesByProducers(filteredRedWines);
    }

    private List<Wine> filterWinesBasedOnPrice(final List<Wine> wines, final PriceInequality priceInequality) {
        List<Wine> result = null;
        switch (priceInequality.getInequality()) {
            case LESS:
                result = wines.stream().filter(wine -> wine.getPrice() < priceInequality.getPrice()).collect(Collectors.toList());
                break;
            case GREATER:
                result = wines.stream().filter(wine -> wine.getPrice() > priceInequality.getPrice()).collect(Collectors.toList());
                break;
            default:
                result = new ArrayList<>();
                logger.error("Unknown Inequality");
        }
        return result;
    }

    private void retrieveWineStashOfStoreNumber(final Integer storeNumber) {
        final List<Product> whiteWineProducts = lcboService.getWinesAtStoreWithQuery(storeNumber, "white+wine");
        final List<Product> redWineProducts = lcboService.getWinesAtStoreWithQuery(storeNumber, "red+wine");

        // Transform the retrieved Products into lower overhead Wine objects.
        redWines = redWineProducts.stream().map(wine -> {
            return extractWine(wine, "red");
        }).collect(Collectors.toList());
        whiteWines = whiteWineProducts.stream().map(wine -> {
            return extractWine(wine, "white");
        }).collect(Collectors.toList());

        // Group By Producers
        Map<String, List<Wine>> groupByProducerMap = groupWinesByProducers(redWines);
    }

    class PriceInequality {
        private Integer price;
        private INEQUALITY inequality;

        public PriceInequality(Integer price, INEQUALITY inequality) {
            this.price = price;
            this.inequality = inequality;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public INEQUALITY getInequality() {
            return inequality;
        }

        public void setInequality(INEQUALITY inequality) {
            this.inequality = inequality;
        }
    }

    // Load wines into a cache to reduce calls to LCBO service
    @PostConstruct
    private void postConstructionInitialization() {
        logger.error("\n\n\nPost Construction\n\n\n");
        // get store
        // Reached my limit with Google for geo. Postal code would have been good too.
        final List<Store> stores = lcboService.getStoreByAddress("808 York Mills");
        storeNumber = stores.get(0).getStore_no();

        userProfiles = new HashMap<>();
        userProfiles.put("david", new PriceInequality(2000, INEQUALITY.LESS));
        userProfiles.put("grant", new PriceInequality(2000, INEQUALITY.GREATER));

        logger.info(String.format("Store Number: %d", storeNumber));

        // get product
        retrieveWineStashOfStoreNumber(storeNumber);

        Map<String, Map<String, List<Wine>>> look = getWinesForUser("david");
    }


}
