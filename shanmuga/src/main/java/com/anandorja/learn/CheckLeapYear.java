package com.anandorja.learn;

public class CheckLeapYear {
 public String display(){
     return "Check";
 }
    public static int leapYear(int year){
        if (year%4==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
