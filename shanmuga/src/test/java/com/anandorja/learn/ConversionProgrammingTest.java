package com.anandorja.learn;

import junit.framework.TestCase;

public class ConversionProgrammingTest extends TestCase {
    ConversionProgramming result = new ConversionProgramming();
    public void testBinaryToOctal(){
        assertEquals(10,result.binaryToDecimal(1010));
    }

}