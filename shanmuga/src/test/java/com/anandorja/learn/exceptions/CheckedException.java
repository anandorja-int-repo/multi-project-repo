package com.anandorja.learn.exceptions;

public class CheckedException {
    public Exception checkedException(int [] a, int [] b){

    int numChoc[] = new int[5];
    try {
        for (int i = 0; i < 5; i++) {
            numChoc[i] = a[i] / b[i];
        }
    }
    catch (ArithmeticException error) {

    }
        //return error.getMessage();
        return null;
    }
}

