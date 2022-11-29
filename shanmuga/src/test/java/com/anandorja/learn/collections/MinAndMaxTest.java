package com.anandorja.learn.collections;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMaxTest extends TestCase {
    MinAndMax result = new MinAndMax();
    List<Integer> l = new ArrayList<>();
    public void testMinAndMax(){
        l.add(3);
        l.add(1);
        l.add(92);
        l.add(34);
        l.add(7);
        List<Integer> sl = Collections.singletonList(result.minAndMax(l));
        assertEquals(92,sl);
    }
}