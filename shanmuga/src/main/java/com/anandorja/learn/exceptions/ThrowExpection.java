package com.anandorja.learn.exceptions;

public class ThrowExpection {
    public int testException(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }


        return c;
    }
}
