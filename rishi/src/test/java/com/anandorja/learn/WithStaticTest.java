package com.anandorja.learn;
import junit.framework.TestCase;
import static java.lang.System.out;

public class WithStaticTest extends TestCase {
    WithStatic app = new WithStatic();

    public void testSquareRoot() {
        double num = app.squareRoot(9);
        assertEquals(3.0,num);
    }

//    public void testRandom() {
//        double num = WithStatic.randomNumber();
//        out.println("random number : "+num);
//        out.println(String.format("i have %,d", 456456456));
//        out.println(String.format("i have %,.2f", 456456456.456456));
//
//    }
}