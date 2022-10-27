package com.anandorja.learn;

import java.util.Stack;

class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> numbers= new Stack<>();

        for(int i = 1; i <= 1000; ++i){
            numbers.push(i);
        }

        long startTime = System.currentTimeMillis();
        System.out.println(numbers.indexOf(5555));
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;

        System.out.println("total run time : "+runTime);
    }
}