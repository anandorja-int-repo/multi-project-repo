package com.anandorja.learn.logicPrograms;

public class FibonacciSeriesInArr {
    public int fibonacciSeries(int num) {
        int[] f = new int[num + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= num; i++) {
            f[i] = f[i - 1] + f[i - 2];

            for (int j = 0; j < num; i++) {


            }
        }
        return f[num];
    }
}
