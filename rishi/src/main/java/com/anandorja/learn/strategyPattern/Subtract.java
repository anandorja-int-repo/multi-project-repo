package com.anandorja.learn.strategyPattern;

public class Subtract implements Calculate{
    @Override
    public int doMath(int num1, int num2) {
        return num1 - num2;
    }
}
