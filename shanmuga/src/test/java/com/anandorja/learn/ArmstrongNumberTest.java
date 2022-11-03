package com.anandorja.learn;

import junit.framework.TestCase;

public class ArmstrongNumberTest extends TestCase {
    ArmstrongNumber number = new ArmstrongNumber();
    public void testArmstrongNumber(){
        assertEquals(true,number.armstrongNumberCheck(370));
    }

}