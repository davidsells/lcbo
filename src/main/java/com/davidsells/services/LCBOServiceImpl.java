package com.davidsells.services;

import com.davidsells.models.Inventory.Inventory;
import com.davidsells.models.Inventory.InventoryResponse;
import com.davidsells.models.Product.Product;
import com.davidsells.models.Product.ProductResponse;
import com.davidsells.models.Store.Store;
import com.davidsells.models.Store.StoreResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("LCBOService")
public class LCBOServiceImpl {
    Logger logger = LoggerFactory.getLogger(LCBOServiceImpl.class);

    @Value("${LCBO.KEY:not set}")
    private static String LCBO_KEY;
    private static final String LCBO_URL = "http://lcboapi.com";
    // Red wine and white wine cannot come from same listing
    // Add store id as parameter
    private static final String LCBO_PRODUCT_URI = LCBO_URL + "/products?access_key={key}&q=red+wine&where_not=is_dead";
    private static final String LCBO_PRODUCT_AT_STORE_URI = LCBO_URL + "/products?access_key={key}&per_page=100&where_not=is_dead&store_id={storeNo}";
    private static final String LCBO_STORE_URI = LCBO_URL + "/stores?access_key={key}&q={address}";
    private static final String LCBO_STORE_INVENTORY_URI = LCBO_URL + "/stores/{store_id}/products/{product_id}/inventory?access_key={key}";



    public List<Store> getStoreByAddress(String address) {
        List<Store> stores = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<StoreResponse> responseEntity = restTemplate.getForEntity(LCBO_STORE_URI, StoreResponse.class, LCBO_KEY, address);
            if (responseEntity.getStatusCodeValue() == 200) {
                stores = responseEntity.getBody().getResult();
            }

        } catch (Exception e) {
            System.err.println("Could not parse: ");
            System.err.println(e.toString());
        }

        if (stores == null) {
            stores = new ArrayList<>();
        }

        return stores;
    }

    public Integer getInventoryOfProductAtStore(final Integer storeId, final Integer productId) {
        Inventory inventory = null;
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<InventoryResponse> responseEntity = restTemplate.getForEntity(LCBO_STORE_INVENTORY_URI, InventoryResponse.class, storeId, productId, LCBO_KEY);
            if (responseEntity.getStatusCodeValue() == 200) {
                inventory = responseEntity.getBody().getInventory();
            }
        } catch (Exception e) {
            System.err.println("Could not parse: ");
            System.err.println(e.toString());
        }

        if (inventory == null) {
            System.err.println("Null inventory");
            return 0;
        } else {
            System.out.println("Inventory: ");
            System.out.println(inventory.toString());
        }

        return inventory.getQuantity();
    }


    public List<Product> getWinesAtStoreWithQuery(final Integer storeNumber, final String query) {
        List<Product> wines = null;
        try {
            String theQuery= String.format("%s&q=%s",LCBO_PRODUCT_AT_STORE_URI,query);
            logger.info("The Query: ",theQuery);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<ProductResponse> responseEntity = restTemplate.getForEntity(theQuery, ProductResponse.class, LCBO_KEY,storeNumber);
            if (responseEntity.getStatusCodeValue() == 200) {
                wines = responseEntity.getBody().getResult();
            }
        } catch (Exception e) {
            System.err.println("Could not parse: ");
            System.err.println(e.toString());
        }

        if (wines == null) {
            wines = new ArrayList<>();
        }
        return wines;
    }
}
