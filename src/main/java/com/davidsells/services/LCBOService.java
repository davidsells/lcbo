package com.davidsells.services;

import com.davidsells.models.Product.Product;
import com.davidsells.models.Store.Store;

import java.util.List;

public interface LCBOService {
    List<Store> getStoreByAddress(String address);

    Integer getInventoryOfProductAtStore(Integer storeId, Integer productId);

    List<Product> getWinesAtStoreWithQuery(Integer storeNumber, String query);
}
