package com.anandorja.learn;

import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayIterator implements Iterator{

    private Object[] arr;
    private int pointer = 0;
    ArrayIterator(Object[] arr){
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        return arr.length > 0 && pointer < arr.length;
    }

    @Override
    public Object next() {
        return arr[pointer++];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
