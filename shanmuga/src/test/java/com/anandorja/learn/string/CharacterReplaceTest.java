package com.anandorja.learn.string;

import junit.framework.TestCase;

public class CharacterReplaceTest extends TestCase {
    CharacterReplace result = new CharacterReplace("Entertainment");

    public void testCharReplace() {
        StringBuffer string = new StringBuffer();
        string.setCharAt(10, 'a');
        assertEquals("Entertainmant", result.replace());
    }

}