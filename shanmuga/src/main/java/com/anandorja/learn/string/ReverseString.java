package com.anandorja.learn.string;

public class ReverseString {
    private String str;
    ReverseString(String str){
        this.str = str;
    }
    public String reverseStr() {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }
}
