package com.anandorja.learn;

import junit.framework.TestCase;

public class ConversionProgrammingTest extends TestCase {
    ConversionProgramming result = new ConversionProgramming();
    public void testBinaryToDecimal()
    {
        assertEquals(10,result.binaryToDecimal(1010));
    }
public void testBinaryToOctal(){
        assertEquals(51,result.binaryToOctal(101001));
}
public void testDecimalToOctal(){
        assertEquals("257",result.decimalToOctal(175));
}
//public void testDecimalTohexa(){
//        assertEquals("4C",result.decimalToHexa(76));
//}
public void testBooleanToString(){
        assertEquals("false",result.booleanToString(false));
}
public void testStringToDouble(){
        assertEquals(7687.98765,result.stringToDouble("7687.98765"));
}
public void testDoubleToString(){
        assertEquals("764354.9843",result.doubleToString(764354.9843));
}
//public void testStringToLong() {
//    assertEquals(999999999999, result.stringToLong("999999999999"));
public void testLongToString(){
    assertEquals("999999999",result.longToString(999999999));
    }
public void testIntToChar(){
        assertEquals('B',result.intToChar(66));
}
public void testCharToInt(){
        assertEquals(3,result.charToInt('3'));
}
}
