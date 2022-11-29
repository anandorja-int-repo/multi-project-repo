package com.anandorja.learn.exceptions;

import junit.framework.TestCase;

public class ThrowExpectionTest extends TestCase {
    ThrowExpection result = new ThrowExpection();

    public void testException(){
        assertEquals(12,result.testException(24,2));
        //assertEquals("java.lang.ArithmeticException:",result.testException(2,0));
    }

}