package com.anandorja.learn.methods;

import junit.framework.TestCase;

public class EqualsEXpTest extends TestCase {
    EqualsEXp result = new EqualsEXp();

    public void testEquals(){
        assertEquals(true,result.sample((short) 20,(short)20));
    }

}