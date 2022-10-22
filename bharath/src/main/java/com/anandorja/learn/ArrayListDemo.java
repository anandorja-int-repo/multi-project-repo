package com.anandorja.learn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayListDemo task = new ArrayListDemo();
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("----------arrayList---------");
        task.addItems(arrayList);
        task.calculateTime(arrayList);
        List<Integer> linList = new LinkedList<>();
        System.out.println("----------LinkedList---------");
        task.addItems(linList);
        task.calculateTime(linList);
        List<Integer> vectorDemo = new Vector<>();
        System.out.println("----------Vector---------");
        task.addItems(vectorDemo);
        task.calculateTime(vectorDemo);
    }
    private void calculateTime(List<Integer> arrayList) {
        long startTime = System.currentTimeMillis();
        System.out.println("starting time :"+startTime);
        System.out.println("the number is "+ arrayList);
        long endTime = System.currentTimeMillis();
        System.out.println("ending time   :"+endTime);
        System.out.println("execution timing   :" + (endTime - startTime));
    }
    private void addItems(List <Integer> items) {
        for (int i = 1; i <= 1000; i++) {
            items.add(i);
        }


    }

}



