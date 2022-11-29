package com.anandorja.learn;

import junit.framework.TestCase;

public class CheckEvenOrAddTest extends TestCase {
    CheckEvenOrAdd check = new CheckEvenOrAdd();
    public void testEvenOrAdd() {
        assertEquals(1, check.evenOrAdd(7));
        //assertEquals(1,check.evenOrAdd(10));

    }

}