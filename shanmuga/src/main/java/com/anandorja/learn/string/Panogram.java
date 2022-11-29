package com.anandorja.learn.string;

import static java.lang.System.out;

public class Panogram {
    private String s;

    Panogram(String s) {
        this.s = s;
    }

    public boolean panogramStr() {
        if (s.length() > 26)
            return false;
        else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.println(ch);
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
