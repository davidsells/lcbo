package com.davidsells.services;

import com.davidsells.models.selection.Wine;

import java.util.List;
import java.util.Map;

public interface UserProfileSearchService {
    Map<String, Map<String, List<Wine>>> getWinesForUser(String userName);

    Integer getStoreNumber();

    public enum INEQUALITY {GREATER, LESS}
}
