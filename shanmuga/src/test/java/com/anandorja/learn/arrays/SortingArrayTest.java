package com.anandorja.learn.arrays;

import junit.framework.TestCase;

public class SortingArrayTest extends TestCase {
    SortingArray result = new SortingArray();
    public void testSort(){
        assertEquals(0, result.sort());
        assertEquals(1, result.reverseSort());
    }

}