package com.anandorja.learn;

import java.util.Iterator;

public class List implements listInterface{
    listInterface ls = new listInterface() {
        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public void insert(int index, Object value) throws IndexOutOfBoundsException {

        }

        @Override
        public void add(Object value) {

        }

        @Override
        public Object delete(int index) throws IndexOutOfBoundsException {
            return null;
        }

        @Override
        public boolean delete(Object value) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Object set(int index, Object value) throws IndexOutOfBoundsException {
            return null;
        }

        @Override
        public Object get(int index) throws IndexOutOfBoundsException {
            return null;
        }

        @Override
        public int indexOf(Object value) {
            return 0;
        }

        @Override
        public boolean contains(Object value) {
            return false;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    };
    public static void main(String[] args) {
        List lm = new List();
        lm.add(12);
        Iterator i = lm.iterator();
        for (i.first(); !i.isDone(); i.next()) {
            System.out.println(lm.current());
        }
    }
    public String toString() {
        return ""+ls;
    }
    @Override
    public void insert(int index, Object value) throws IndexOutOfBoundsException {

    }

    @Override
    public void add(Object value) {
        ls.add(value);
    }

    @Override
    public Object delete(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public boolean delete(Object value) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object set(int index, Object value) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int size() {
        return 0;
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
