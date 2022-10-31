package com.anandorja.learn;

import java.util.Iterator;

class DynamicArray implements ListDemo {
    private Object[] arr;
    private int size;
    private int capacity;

    private final int intialCapacity;

    DynamicArray() {
        size = 0;
        intialCapacity = 8;
        arr = new Object[intialCapacity];
        capacity = intialCapacity;
    }
    public void insert(int index, Object value) {

        if (size >= arr.length) {
            Object[] arr2 = new Object[2 * size];
            for (int i = 0; i <= arr.length - 1; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    @Override
    public void add(Object value) {
        Object[] arr2 = new Object[0];
        if (size >= arr.length) {
            arr2 = new Object[2 * size];
            for (int i = 0; i <= arr.length - 1; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            arr[size++] = value;
        } else {
            arr[size++] = value;
        }
    }



    public Object delete(int index) {
        Object a = arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
            size--;
            return a;
        }

    @Override
    public boolean delete(Object value) {
        return false;
    }

    @Override
    public void clear() {

    }

    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    public Object set(int index,Object value){
        return null;
    }

    public int size() {
    return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}