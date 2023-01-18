package com.anandorja.learn.strategyPattern;

public class CalculateContext {
    private Calculate calculate;
    CalculateContext(Calculate calculate){
        this.calculate = calculate;
    }
    public int executeMath(int num1, int num2){
        return calculate.doMath(num1,num2);
    }
}
