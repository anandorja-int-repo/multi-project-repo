package com.anandorja.learn;

public class CheckLeapYear {
    public static int leapYear(int year){
        if (year%4==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
