package com.anandorja.learn.methods;

import junit.framework.TestCase;

public class CompareOfExpTest extends TestCase {
    CompareOfExp result = new CompareOfExp();
    public void testCompareOf(){
        assertEquals(0,result.compareInt(5,5));
        assertEquals(-1,result.compareIntegers(12,13));
    }

}