package com.anandorja.learn.arrays;

public class ArrayExp {
    public boolean elementExists(int a){
        int arr[] = {1,4,32,5,6,4,8};
        boolean test = false;
        for (int element : arr) {
            if (element == a) {
                test = true;
            }
        }
        return test;
    }
}
