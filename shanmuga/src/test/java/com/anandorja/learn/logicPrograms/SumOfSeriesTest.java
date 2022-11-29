package com.anandorja.learn.logicPrograms;

import junit.framework.TestCase;

public class SumOfSeriesTest extends TestCase {
    SumOfSeries result = new SumOfSeries();

    public void testSumOfSeries(){
      assertEquals(15,result.sumOfSeries(5));
    }

}