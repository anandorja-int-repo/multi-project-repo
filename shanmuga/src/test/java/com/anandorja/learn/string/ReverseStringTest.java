package com.anandorja.learn.string;

import junit.framework.TestCase;

public class ReverseStringTest extends TestCase {
    ReverseString result = new ReverseString("happah");

    public void testReverseStr() {
        assertEquals("happah", result.reverseStr());
    }

}