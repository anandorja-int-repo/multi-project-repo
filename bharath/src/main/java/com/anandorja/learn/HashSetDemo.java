package com.anandorja.learn;
import java.util.*;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("add iteams"+set);
        //--------Remove--------
        set.remove(1);
        System.out.println("after remove "+set);
        HashSet<Integer> set1=new HashSet<Integer>();
        set1.add(6);
        set1.add(7);
        set.addAll(set1);
        System.out.println("Updated List"+set);
        set.removeAll(set1);
        System.out.println("After updated List removeAll()"+set);
        //Removing elements on the basis of specified condition
//        set.removeIf(str->str.contains("Vijay"));
//        System.out.println("After invoking removeIf() method: "+set);
//        //Removing all the elements available in the set
       set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}

