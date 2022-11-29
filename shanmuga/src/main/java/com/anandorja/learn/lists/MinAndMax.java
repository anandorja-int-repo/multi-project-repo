package com.anandorja.learn.lists;

import java.util.ArrayList;

public class MinAndMax {

    public int minAndMax(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(13);
        al.add(45);
        al.add(96);
        al.add(10);
        al.add(65);
        al.add(93);
        int min = al.get(0);
        int max = al.get(0);
        for(Integer i:al){
            if (min > i){
                return min;
            }
        }
        for(Integer i:al){
            if(max < i)
            return max;
        }

        return min;
    }
}
