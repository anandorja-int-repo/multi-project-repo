package com.anandorja.learn;

import junit.framework.TestCase;

public class FloatDemoTest extends TestCase {

    public void testFloat() {
        FloatDemo demo = new FloatDemo();
        float result = demo.multiply(1.5f,1.5f);
        assertEquals(2.25f,result);
    }

}