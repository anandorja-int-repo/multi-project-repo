package com.anandorja.learn.arrays;

public class TwoDArrayMultiply {
    public int[][] arrayMultiply(int[][] a, int[][] b) {
        int [][] c = new int[2][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] = a[i][k] * b[k][j];
                }

            }
        }
        return c;
    }
}
