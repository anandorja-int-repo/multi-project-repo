package com.anandorja.learn.logicPrograms;

public class ReverseNumbers {
    public int performReverse(int number) {
        int rev = 0;
        int temp = number;
        while (number != 0) {

            int rem = number % 10;

            rev = rev * 10 + rem;

            number = number / 10;
        }
        return rev;
    }
}
