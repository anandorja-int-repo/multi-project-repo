package com.anandorja.learn;

import junit.framework.TestCase;

public class SimpleInterestTest extends TestCase {
    SimpleInterest interest = new SimpleInterest();
    public void testSI(){
        assertEquals(2500,interest.pnr(10000,5,5));
    }
}