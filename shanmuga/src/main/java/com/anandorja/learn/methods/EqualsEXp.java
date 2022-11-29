package com.anandorja.learn.methods;

import java.util.Objects;

public class EqualsEXp {
    public boolean sample(short a, short b) {
        short x = a;
        short y = b;
        boolean output = Objects.equals(x, y);
        return output;
    }
}
