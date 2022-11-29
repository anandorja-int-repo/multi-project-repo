package com.anandorja.learn.arrays;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CopyBetweenArraysTest extends TestCase {
    CopyBetweenArrays result = new CopyBetweenArrays();
    public void testCopyArrays(){
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[5];
        int j = 0;
        for(int k: result.copyArrays(a,b)){
            assertEquals(a[j++],k);
        }

    }

}