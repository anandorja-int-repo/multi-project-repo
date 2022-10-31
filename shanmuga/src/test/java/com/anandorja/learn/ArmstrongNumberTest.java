package com.anandorja.learn;

import junit.framework.TestCase;

public class ArmstrongNumberTest extends TestCase {
    ArmstrongNumber number = new ArmstrongNumber();
    public void testArmstrongNumber(){
        assertEquals(1,number.armstrongNumberCheck(370));
    }

}