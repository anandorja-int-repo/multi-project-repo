package com.anandorja.learn;

 interface IList extends Iterable{
     void insert(int index, Object value) throws IndexOutOfBoundsException;
     void add(Object value);
     Object delete(int index) throws IndexOutOfBoundsException;
    /** boolean delete(Object value);*/
     void clear();
     Object set(int index, Object value) throws IndexOutOfBoundsException;
     Object get(int index) throws IndexOutOfBoundsException;
     int indexOf(Object value);
     boolean contains(Object value);
     int size();
     boolean isEmpty();
}
