package com.anandorja.learn.logicPrograms;

public class SumOfSeries {
    public int sumOfSeries(int noOfElement ) {
        int  sum = 0;
    for(int n = 1; n <= noOfElement; n++){
        sum = sum + n;
}
        return sum;
    }
}