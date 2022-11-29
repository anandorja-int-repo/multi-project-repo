package com.anandorja.learn.string;

import junit.framework.TestCase;

public class CharacterTest extends TestCase {
    Character result = new Character("Entertainment");

    public void testGetChar() {
        assertEquals('E', result.getChar(0));
        assertEquals('t', result.getChar(12));
    }

}