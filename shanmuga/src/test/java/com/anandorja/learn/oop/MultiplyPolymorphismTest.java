package com.anandorja.learn.oop;

import junit.framework.TestCase;

public class MultiplyPolymorphismTest extends TestCase {
    MultiplyPolymorphism num1 = new MultiplyPolymorphism();

    public void testMultiply(){
        assertEquals(6,num1.multiply(2,3));
    }
    public void testMultiplies(){
        assertEquals(6.25f,num1.multiplies(2.5f,2.5f));
    }

}