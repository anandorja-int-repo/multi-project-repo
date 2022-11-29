package com.anandorja.learn.collections;

import java.util.Collections;
import java.util.List;

public class MinAndMax {
    public int minAndMax(List<Integer> l ){
        int minimun = Collections.min(l);
        int maximunm = Collections.max(l);
        if (minimun==maximunm){
            return minimun;
        }

        return maximunm;
    }
}
