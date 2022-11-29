package com.anandorja.learn.date;

import junit.framework.TestCase;

public class CheckDateTest extends TestCase {
    CheckDate result = new CheckDate();
    public void testCheckDate(){

        assertEquals("",result.today());
    }

}