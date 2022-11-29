package com.anandorja.learn.methods;

import junit.framework.TestCase;

public class StaticExpTest extends TestCase {
    StaticExp no = new StaticExp();
    public void testAdd(){
        assertEquals(5,2,3);
    }
    public void testSum(){
        assertEquals(6,no.sum(2,4));
    }

}