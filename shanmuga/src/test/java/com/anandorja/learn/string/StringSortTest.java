package com.anandorja.learn.string;

import junit.framework.TestCase;

public class StringSortTest extends TestCase {
    StringSort result = new StringSort("rock");
    StringSort result1 = new StringSort("bee");
    public void testSort(){
        assertEquals("ckor",result.stringSorting());
        assertEquals("bee",result1.stringSorting());
    }
}