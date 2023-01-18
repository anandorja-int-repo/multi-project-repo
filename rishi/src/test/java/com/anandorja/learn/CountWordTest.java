package com.anandorja.learn;

import junit.framework.TestCase;

public class CountWordTest extends TestCase {

    CountWord cw = new CountWord();

//    public void testTestFileWordCount() {
//        int count = cw.fileWordCount("C:\\Users\\Rishi\\Downloads\\sample.txt","Hi");
//        assertEquals(3,count);
//    }

    public void testLineWordCount() {
        int count = cw.lineWordCount("hello world","Hello");
        assertEquals(1,count);
    }
}