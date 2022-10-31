package com.anandorja.learn;

import junit.framework.TestCase;

public class CheckLeapYearTest extends TestCase {
    public void testLeapYear(){
        CheckLeapYear year = new CheckLeapYear();
        assertEquals(0,year.leapYear(2003));
        assertEquals(1,year.leapYear(2004));
    }

}