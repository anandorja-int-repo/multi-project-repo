package com.anandorja.learn;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleStartUpTest extends TestCase {
    String[] locationsArray = {"A2", "A3", "A4"};
    List<String> location = Arrays.asList(locationsArray);

    public void testSuccessfulHit() {
        SimpleStartUp game = new SimpleStartUp();
        game.setLocationCells(location);
        assertEquals("hit", game.checkYourself("A2"));
        assertEquals("hit", game.checkYourself("A3"));
        assertEquals("kill", game.checkYourself("A4"));
    }

    public void testUnSuccessfulHits() {
        SimpleStartUp game = new SimpleStartUp();
        game.setLocationCells(location);
        assertEquals("hit", game.checkYourself("A2"));
        assertEquals("miss", game.checkYourself("A0"));
        assertEquals("miss", game.checkYourself("A5"));
    }

    public void testMoreHits() {
        SimpleStartUp game = new SimpleStartUp();
        game.setLocationCells(location);
        assertEquals("hit", game.checkYourself("A2"));
        assertEquals("miss", game.checkYourself("A2"));
        assertEquals("miss", game.checkYourself("A2"));
    }
}