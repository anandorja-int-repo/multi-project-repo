package com.anandorja.learn.arrays;

import junit.framework.TestCase;

public class ArrayTransposeTest extends TestCase {
    ArrayTranspose result = new ArrayTranspose();

    public void testTranspose() {
        assertEquals(2,result.transposeMatrix(2));


//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] eResult = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
//        int[][] out = result.transpose(matrix);
//
//        int[][] tr = new int[3][3];
//        int[][] a = new int[3][3];
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < 3; col++) {
//                //tr[row][col] = a[col][row];
//                assertEquals(eResult[row][col], out[row]);
//            }
//        }
    }
}