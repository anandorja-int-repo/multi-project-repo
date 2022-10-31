package com.anandorja.learn;

import java.util.HashMap;
import java.util.Map;

public class HashMapAbs {
   public static void main(String[] args){
      HashMap<Integer,String> map=new HashMap();//Creating HashMap
      map.put(1,"Mango");  //Put elements in Map
      map.put(2,"Apple");
      map.put(3,"Banana");
      map.put(4,"Grapes");

      System.out.println("Iterating Hashmap...");
      for(
              Map.Entry m : map.entrySet()){
         System.out.println(m.getKey()+" "+m.getValue());
      }
      System.out.println("-----------------");
      for(int key : map.keySet()){
         System.out.println(map.get(key));
      }
   }
}

