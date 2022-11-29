package com.anandorja.learn.logicPrograms;

import junit.framework.TestCase;

public class LinearSearchTest extends TestCase {
    LinearSearch result = new LinearSearch();

    public void testLinearSearch(){
        int[] arr = { 3, 4, 1, 7, 5 };
        assertEquals(-1,result.search(arr,arr.length,7));
    }

}