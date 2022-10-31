package com.anandorja.learn;

import junit.framework.TestCase;

public class VowelOrConsonantTest extends TestCase {
    VowelOrConsonant letter = new VowelOrConsonant();
    public void testVowelOrConsonant(){
        assertEquals(1,letter.vowelOrConsonant('A'));
        assertEquals(0,letter.vowelOrConsonant('v'));
    }
}