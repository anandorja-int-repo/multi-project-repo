package com.anandorja.learn;

import java.util.LinkedList;

class linkList {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        for(int i = 1; i <= 1000; ++i){
            numbers.add(i);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(numbers.contains(159));
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;

        System.out.println("total run time : "+runTime);
    }
}