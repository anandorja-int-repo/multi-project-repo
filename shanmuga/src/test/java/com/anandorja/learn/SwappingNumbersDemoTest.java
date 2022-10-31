package com.anandorja.learn;

import junit.framework.TestCase;

public class SwappingNumbersDemoTest extends TestCase {

    public void testSwap() {
        SwappingNumbersDemo swap = new SwappingNumbersDemo();
        int m = 32, n = 23;
        int result = swap.swapNumbers(m,n);
        assertEquals(23,32,result);
    }

}