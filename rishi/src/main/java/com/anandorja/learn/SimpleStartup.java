package com.anandorja.learn;

import java.util.ArrayList;
import java.util.List;

public class SimpleStartup {
    private List<String> locationcells;
    private ArrayList<String> copylocationcells;
    public void setLocationcells(List<String> location){
        locationcells = location;
        copylocationcells = new ArrayList<>(locationcells.size());
        copyElements();
    }
    public void copyElements(){
        for (int i = 0; i < locationcells.size();i++){
            copylocationcells .add(locationcells.get(i));
        }
    }
    public String checkYourself(String guess){
        String result = "miss";
        int index = copylocationcells.indexOf(guess);
        if (index>=0){
            copylocationcells.remove(index);
            if (copylocationcells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }
        return result;
    }
}
