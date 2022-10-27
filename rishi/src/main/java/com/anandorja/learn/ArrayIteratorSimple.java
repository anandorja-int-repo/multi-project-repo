package com.anandorja.learn;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIteratorSimple implements Iterator {
    int current = 0;  // the current element we are looking at
    private Object[] arr;
    ArrayIteratorSimple(Object[] arr){
        this.arr = arr;
    }
    // return whether or not there are more elements in the array that
    // have not been iterated over.
    @Override
    public boolean hasNext() {
        if (current < arr.length) {
            return true;
        } else {
            return false;
        }
    }

    // return the next element of the iteration and move the current
    // index to the element after that.
    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return arr[current++];
    }
}
