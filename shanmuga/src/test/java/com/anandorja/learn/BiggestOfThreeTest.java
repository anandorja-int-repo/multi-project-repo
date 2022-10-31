package com.anandorja.learn;

import junit.framework.TestCase;

public class BiggestOfThreeTest extends TestCase {
    BiggestOfThree big = new BiggestOfThree();
    public void testThree(){
        assertEquals(5, big.bigAmongThree(3,4,5));
    }

}