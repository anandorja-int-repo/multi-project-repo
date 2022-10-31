package com.anandorja.learn;

import java.util.Vector;

class VectorCollection {
    public static void main(String[] args) {
        Vector<Integer> numbers= new Vector<>();

        for(int i = 1; i <= 1000; ++i){
            numbers.add(i);
        }
        long startTime = System.currentTimeMillis();
        System.out.println(numbers.contains(857));
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;

        System.out.println("total run time : "+runTime);
    }
}