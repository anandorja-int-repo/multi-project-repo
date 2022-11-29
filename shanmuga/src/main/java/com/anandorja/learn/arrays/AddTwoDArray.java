package com.anandorja.learn.arrays;

public class AddTwoDArray {


    public int[][] addArray(int[][] a, int[][] b) {
        int row = 2, column = 2;
        int[][] sum = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
}
