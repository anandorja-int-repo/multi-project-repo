package com.anandorja.learn;

public class GCDExample {
    static int gcdCheck(int a, int b) {
        int min;
        min = a < b ? a : b;
        while (min >= 2) ;
        {
            if (a % min == 0 && b % min == 0) {
                return min;
            }
            min--;

        }
        return a;
    }
}
