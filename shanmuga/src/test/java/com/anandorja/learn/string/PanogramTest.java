package com.anandorja.learn.string;

import junit.framework.TestCase;

public class PanogramTest extends TestCase {
Panogram result = new Panogram("abcdefghijklmnopqrstuvwxyz");
public void testPanogarm(){
    assertEquals(true,result.panogramStr());
}

}