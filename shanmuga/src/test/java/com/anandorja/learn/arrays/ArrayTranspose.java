package com.anandorja.learn.arrays;

public class ArrayTranspose {
    int [][] transpose = {{1,2},{3,4},{4,5}};
            int columnTotal = 0;
    public int transposeMatrix(int a) {
        int rows = transpose.length;
        int cols = columnTotal;
        for (int i = 0; i< transpose.length;i++){
            columnTotal = columnTotal+transpose[i][0];
        }

        return columnTotal;
//         int [][] transposeArray = new int [col][rows];
//        for (int row = 0; row < tr.length; row++) {
//            for (int col = 0; col < 2; col++) {
//                tr[row][col] = a[col][row];
//            }
//        }
        //return a;
    }
}
