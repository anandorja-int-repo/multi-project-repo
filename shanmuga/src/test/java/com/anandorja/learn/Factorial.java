package com.anandorja.learn;

public class Factorial {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n * factorial(n-1);
    }

}

