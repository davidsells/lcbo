package com.davidsells.models.selection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WineRequest implements Serializable {
    Logger logger = LoggerFactory.getLogger(WineRequest.class);
    private String user;
    private Map<String, List<Wine>> redWines;
    private Map<String, List<Wine>> whiteWines;
    private Integer redWineCount = 0;
    private Integer whiteWineCount = 0;
    private Integer numberOfWinesCount = 0;
    private final Double desiredRatio = new Double(0.75);

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
            double ratio = (double)redWineCount / (double)numberOfWinesCount;
            if (Double.compare(ratio, desiredRatio) == 1) {
                result = "white";
            } else {
                result = "red";
            }
            logger.info(String.format("redCount: %d, numberOfWines: %d, ratio: %f type: %s",redWineCount,numberOfWinesCount,ratio,result));
        }
        return result;
    }

    public Wine getNextWine(Integer attempt) {
        String type = typeOfNextWine();
        Map<String, List<Wine>> wineList;
        if (type.equals("red")) {
            wineList = redWines;
        } else {
            wineList = whiteWines;
        }
        Map.Entry<String, List<Wine>> entry = wineList.entrySet().iterator().next();
        if(entry.getValue().size() < attempt) {
            String key = entry.getKey();
            attempt = 0;
            removeProducer(key);
            entry = wineList.entrySet().iterator().next();
        }
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
