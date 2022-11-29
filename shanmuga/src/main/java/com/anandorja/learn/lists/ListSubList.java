package com.anandorja.learn.lists;

import java.util.ArrayList;
import java.util.List;

public class ListSubList {

    public List subList(List <Integer> al, int startIndex, int endIndex) {

        if (al.size() >= endIndex) {
              return al.subList(startIndex, endIndex);
        }
        throw new IllegalArgumentException("end index greater than size");
    }
}