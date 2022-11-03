package com.anandorja.learn;

public class ConversionProgramming {

    public int binaryToDecimal(int binary) {
        int decimal = 0;
        int i = 0;
        while (binary > 0) {
            int rem = binary % 10;
            decimal = decimal+rem * (int) (Math.pow(2, i++));
            binary = binary / 10;
        }
        return decimal;
    }

}

