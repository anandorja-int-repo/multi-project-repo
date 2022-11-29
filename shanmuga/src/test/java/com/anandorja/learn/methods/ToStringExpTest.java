package com.anandorja.learn.methods;

import junit.framework.TestCase;

public class ToStringExpTest extends TestCase {
    ToStringExp result = new ToStringExp("Raja",8766);
    public void testStringExp(){
        String value = result.toString();
        assertEquals("Raja 8766",value);
    }
}