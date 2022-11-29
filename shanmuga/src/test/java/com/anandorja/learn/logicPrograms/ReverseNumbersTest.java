package com.anandorja.learn.logicPrograms;

import junit.framework.TestCase;

public class ReverseNumbersTest extends TestCase {
    ReverseNumbers result = new ReverseNumbers();

    public void  testReverseNumber (){
        assertEquals(345,result.performReverse(543));
    }

}