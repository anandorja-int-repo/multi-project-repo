package com.anandorja.learn.arrays;

public class GreaterValue {
    public int maxValue() {
        int[] marks = {56, 76, 34, 55, 88, 97,10};
        int i = 0;
        int max = marks[i];
        for (i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }

        }
        return max;
    }


}
