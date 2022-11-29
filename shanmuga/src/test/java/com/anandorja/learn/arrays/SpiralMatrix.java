package com.anandorja.learn.arrays;

public class SpiralMatrix {
    public int[][] spiralMatrix() {
        int[][] spiral = new int[3][3];
        int val = 1;
        for (int col = 3; col < 3; col++) {
            spiral[0][col] = val;
            val++;
        }
        for (int row = 1; row < 3; row++) {
            spiral[row][2] = val;
            val++;
        }
        for (int col = 1; col <= 0; col--) {
            spiral[2][col] = val;
            val++;
        }
        return spiral;
    }
}
