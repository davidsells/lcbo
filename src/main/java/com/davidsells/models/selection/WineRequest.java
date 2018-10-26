package com.davidsells.models.selection;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WineRequest implements Serializable {
    private String user;
    private Map<String, List<Wine>> redWines;
    private Map<String, List<Wine>> whiteWines;
    private Integer redWineCount = 0;
    private Integer whiteWineCount = 0;
    private Integer numberOfWinesCount = 0;
    private Float desiredRatio = new Float(0.75);

    public WineRequest(String user, Map<String, Map<String, List<Wine>>> wineTypeList) {
        redWines = wineTypeList.get("red");
        whiteWines = wineTypeList.get("white");
        this.user = user;
    }

    private String typeOfNextWine() {
        String result = null;
        if (numberOfWinesCount == 0) {
            result = "red";
        } else if (numberOfWinesCount == 1) {
            result = "white";
        } else {
            Float ratio = new Float(redWineCount / numberOfWinesCount);
            if (Float.compare(ratio, desiredRatio) == 1) {
                result = "white";
            } else {
                result = "red";
            }
        }
        return result;
    }

    public Wine getNextWine(final Integer attempt) {
        String type = typeOfNextWine();
        Map<String, List<Wine>> wineList;
        if (type.equals("red")) {
            wineList = redWines;
        } else {
            wineList = whiteWines;
        }
        Map.Entry<String, List<Wine>> entry = wineList.entrySet().iterator().next();
        String key = entry.getKey();
        return entry.getValue().get(attempt);
    }


    public String getUser() {
        return user;
    }

    public Map<String, List<Wine>> getRedWines() {
        return redWines;
    }

    public Map<String, List<Wine>> getWhiteWines() {
        return whiteWines;
    }

    public void acceptWineSelection(Wine wine) {
        numberOfWinesCount++;
        if (wine.getType().equals("red")) {
            redWineCount++;
        } else {
            whiteWineCount++;
        }
        removeProducer(wine.getProducer());
    }

    private void removeProducer(final String producer) {
        redWines.remove(producer);
        whiteWines.remove(producer);
    }
}
