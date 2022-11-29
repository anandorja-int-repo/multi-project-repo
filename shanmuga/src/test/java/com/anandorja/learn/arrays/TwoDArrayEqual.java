package com.anandorja.learn.arrays;

import java.util.Arrays;

public class TwoDArrayEqual {
    public boolean equalOrNot() {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5};
        boolean expected = Arrays.equals(a, b);
        if (expected == true) {
            return true;
        }
        return false;
    }
    }
