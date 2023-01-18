package com.anandorja.learn.strategyPattern;

import junit.framework.TestCase;

public class CalculateContextTest extends TestCase {

    public void testExecuteMath() {
        CalculateContext cc = new CalculateContext(new Add());
        assertEquals(3, cc.executeMath(1, 2));
        cc = new CalculateContext(new Subtract());
        assertEquals(3, cc.executeMath(3, 0));
        cc = new CalculateContext(new Multiply());
        assertEquals(3, cc.executeMath(1, 3));

    }
}