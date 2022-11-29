package com.anandorja.learn.arrays;

import junit.framework.TestCase;

public class AddTwoDArrayTest extends TestCase {
    AddTwoDArray result = new AddTwoDArray();
    public void testAddArray(){
        int[][] firstMatrix = {{2, 3,}, {5, 2,}};
        int[][] secondMatrix = {{8, 5,}, {5, 6,}};
        int[][] eResult = {{10, 8,}, {10, 8,}};
        int [][] out = result.addArray(firstMatrix,secondMatrix);
        int row = 2, column = 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                assertEquals(eResult[i][j],out[i][j]);
            }
        }
    }
}