package com.anandorja.learn.collections;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionToArrTest extends TestCase {
    CollectionToArr result = new CollectionToArr();
    List<String> l = new ArrayList<>();
    public void testCollectionToArr(){
        l.add("hi");
        l.add("how");
        l.add("high");
        l.add("are you");
        List<String> sl = Collections.singletonList(result.collectionToArr(l));
        assertEquals("hi how high are you",sl);
    }

}