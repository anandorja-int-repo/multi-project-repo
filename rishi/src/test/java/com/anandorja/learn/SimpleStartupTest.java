package com.anandorja.learn;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class SimpleStartupTest extends TestCase {
    SimpleStartup obj = new SimpleStartup();
    String[] guessCell = {"A1", "A8", "A7"};
    List<String> location = Arrays.asList(guessCell);
    public void testcheckhitsucessfull() {
        obj.setLocationcells(location);
        assertEquals("hit", obj.checkYourself("A1"));
        assertEquals("hit", obj.checkYourself("A8"));
        assertEquals("kill", obj.checkYourself("A7"));
    }

    public void testcheckmisssucessfull() {
        obj.setLocationcells(location);
        assertEquals("miss", obj.checkYourself("A0"));
        assertEquals("miss", obj.checkYourself("A2"));
        assertEquals("miss", obj.checkYourself("A6"));
    }

    public void testmorehits(){
        obj.setLocationcells(location);
        assertEquals("hit", obj.checkYourself("A1"));
        assertEquals("miss", obj.checkYourself("A1"));
        assertEquals("miss", obj.checkYourself("A1"));


    }
}