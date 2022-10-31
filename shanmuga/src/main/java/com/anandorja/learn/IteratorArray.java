package com.anandorja.learn;

public class IteratorArray {
    public static void main(String[] args) {

        String[] anArray = new String[3];
        anArray[0] = "Apple";
        anArray[1] = "Banana";
        anArray[2] = "Cherry";
        for (
                int i = 0;
                i < anArray.length; ++i) {
            System.out.println(anArray[i]);
        }
    }
}
