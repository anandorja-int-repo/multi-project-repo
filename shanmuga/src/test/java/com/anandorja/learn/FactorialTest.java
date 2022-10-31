package com.anandorja.learn;

import junit.framework.TestCase;

public class FactorialTest extends TestCase {
    Factorial number = new Factorial();
    public void testFactorial(){
        assertEquals(24,number.factorial(4));
        assertEquals(1,number.factorial(0));
    }

}