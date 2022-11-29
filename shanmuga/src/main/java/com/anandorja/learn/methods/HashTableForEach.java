package com.anandorja.learn.methods;

import java.util.Hashtable;
import java.util.Map;

public class HashTableForEach {
    public int example(){
        Map<String,Integer> data = new Hashtable<>();
        data.put("Siva",76987);
        data.put("Kesav",78787);
        data.put("krishna",78657);
        data.forEach((k,v) ->{
            v =v+1;
            data.replace(k,v);
        });
        data.forEach((k,v) ->{
           return ;
        });

        return 0;
    }
}
