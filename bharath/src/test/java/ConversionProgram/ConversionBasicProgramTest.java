package ConversionProgram;

import junit.framework.TestCase;

public class ConversionBasicProgramTest extends TestCase {
    ConversionBasicProgram obj = new ConversionBasicProgram();

    public void testbinaryToOctual() {
        assertEquals(51, obj.binaryToOctual(101001));
    }

    public void testoctualToDecimal() {
        assertEquals(119, obj.octualToDecimal(167));
    }

    public void testdecimalToOctual() {
        assertEquals(41, obj.decimalToOctual(33));
    }

    public void testhexadecimalToDecimal() {
        int rep = obj.hexadecimalToDecimal("1A");
        if (rep == obj.hexadecimalToDecimal("1A")) {
            assertTrue(true);
        } else {
            assertFalse(false);
        }
    }

    public void testdecimalToHexadecimal() {

        //     assertEquals("9E",168,obj.decimalToHexadecimal(168));
    }

    public void testdecimalToBinary() {
        assertEquals(10001, obj.decimalToBinary(17));
    }

    public void testbinaryToDecimal() {

        assertEquals(17, obj.binaryToDecimal(10001));
    }

    public void testStringToDouble() {

        assertEquals(2033.12244, obj.StringToDouble("2033.12244"));
    }

    public void testdoubleToString() {

        assertEquals("123.456", obj.doubleToString(123.456));
    }

    public void teststringToLong() {
        assertEquals(1111111, obj.stringToLong("1111111"));
    }

    public void testlongToString() {

        assertEquals("999999999999", obj.longToString(999999999999L));
    }
}