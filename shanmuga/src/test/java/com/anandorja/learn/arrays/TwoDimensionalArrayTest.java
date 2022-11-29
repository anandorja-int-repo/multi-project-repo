package com.anandorja.learn.arrays;

import junit.framework.TestCase;

public class TwoDimensionalArrayTest extends TestCase {
    TwoDimensionalArray result = new TwoDimensionalArray();
    public void testTwoDimensional(){
        assertEquals(result.twoDimension(),4);
    }
}