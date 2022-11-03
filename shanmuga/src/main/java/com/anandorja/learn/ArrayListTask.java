package com.anandorja.learn;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ArrayListTask {

    public static void main(String[] args) {

        ArrayListTask task = new ArrayListTask();

        List<Integer> arrayList = new ArrayList<Integer>();
        task.addItems(arrayList);
        task.calculateTime(arrayList);

        List<Integer> vector = new Vector<Integer>();
        task.addItems(vector);
        task.calculateTime(vector);

        List<Integer> lList = new LinkedList<Integer>();
        task.addItems(lList);
        task.calculateTime(lList);
        task.removeItems(lList);

    }

    private void calculateTime(List<Integer> arrayList) {
        long startTime = new Date().getTime();

        System.out.println(startTime);
        System.out.println(arrayList);
        long endTime = new Date().getTime();
        System.out.println(endTime - startTime);
    }

    private void addItems(List<Integer> items) {
        for (int i = 1; i <= 1000; i++) {
            items.add(i);

        }
    }

    private void removeItems(List<Integer> items) {
        items.remove(0);

    }

}
