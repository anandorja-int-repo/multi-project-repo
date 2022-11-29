package com.anandorja.learn.arrays;

import junit.framework.TestCase;

public class ArrayExpTest extends TestCase {
    ArrayExp result = new ArrayExp();

    public void testArray(){
        assertEquals(false,result.elementExists(2));
        assertEquals(true,result.elementExists(6));
    }

}