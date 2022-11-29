package com.anandorja.learn.collections;

import java.util.List;

public class CollectionToArr {
    public String collectionToArr(List<String> l) {
        String[] str = l.toArray(new String[0]);

        String data = null;
        for (int i = 0; i < str.length; i++) {
            data = str[i];
        }
        return data;
    }
}
