package com.anandorja.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleStartUp {
    private List<String> locationCells;
    private ArrayList<String> locationCellsCopy;
    private String name;

    public void setLocationCells(List<String> location) {
        locationCells = location;
        locationCellsCopy = new ArrayList<>(locationCells.size());
        copyElements();
    }

    private void copyElements() {
        for (int i = 0; i < locationCells.size(); i++) {
            locationCellsCopy.add(locationCells.get(i));
        }

    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCellsCopy.indexOf(userInput);
        if (index >= 0) {
            locationCellsCopy.remove(index);
            if (locationCellsCopy.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}



