package com.anandorja.learn.arrays;

import junit.framework.TestCase;

public class GreaterValueTest extends TestCase {
    GreaterValue result = new GreaterValue();
    public void testMaxValue(){
        assertEquals(97, result.maxValue());
    }
}