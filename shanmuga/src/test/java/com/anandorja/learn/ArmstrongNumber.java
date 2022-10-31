package com.anandorja.learn;

public class ArmstrongNumber {
    public static int armstrongNumberCheck(int original) {
        int temp;
        int check = 0;
        while (original > 0) {
            temp = original % 10;
            check = check + (temp * temp * temp);
            original = original / 10;
            if (original == check) {
                return 1;
            }
            else {
                return 0;
            }
        }
        return 0;
    }
}