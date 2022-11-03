package com.anandorja.learn;

public class ArmstrongNumber {
    public boolean armstrongNumberCheck(int original) {
        int c=0,a, temp;
        temp = original;
        while (original > 0) {
            a = original % 10;
            original = original / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            return true;
        }
        return false;
    }
}
    