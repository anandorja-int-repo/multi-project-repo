package com.anandorja.learn;

import junit.framework.TestCase;

public class GCDExampleTest extends TestCase {
    GCDExample result = new GCDExample();
    public void testGCD(){
        assertEquals(6,result.gcdCheck(12,30));
    }

}