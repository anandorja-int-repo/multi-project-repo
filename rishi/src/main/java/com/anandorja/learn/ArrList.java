package com.anandorja.learn;

import java.util.Arrays;
import java.util.Iterator;

public class ArrList implements IList {
    private Object[] holder = new Object[3];
    private int size = 0;
    @Override
    public void insert(int index, Object value) throws IndexOutOfBoundsException {
        Object[] temp = new Object[size+1];
        for(int i = 0; i < index; ++i ){
            temp[i] = holder[i];
        }
        temp[index] = value;
        for(int j = index + 1; j <= size; ++j )
        {
            temp[j] = holder[j-1];
        }
        holder = temp;
    }

    @Override
    public void add(Object value) {
        if(size == holder.length){
            Object[] temp = new Object[2*size];
            for(int i = 0; i < size; ++i ){
                temp[i] = holder[i];
            }
            holder = temp;
        }
        holder[size++] = value;
    }

    @Override
    public Object delete(int index) throws IndexOutOfBoundsException {
        Object del = holder[index];
        for(int i = index; i < size-1; ++i){
            holder[i] = holder[i + 1];
        }
        holder[--size] = null;
        return del;
    }

    /**@Override
    public boolean delete(Object value) {
        for(int i = 0; i < size; ++i){
            if(holder[i] == value){
                for(int j = i; i < size-1; ++i){
                    holder[i] = holder[i + 1];
                }
                holder[--size] = null;
                return true;
            }
        }
        return false;
    }*/

    @Override
    public void clear() {
        holder = new Object[15];
        size = 0;
    }

    @Override
    public Object set(int index, Object value) throws IndexOutOfBoundsException {
        holder[index] = value;
        return true;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return holder[index];
    }

    @Override
    public int indexOf(Object value) {
        for(int i = 0; i < size; i++){
            if( holder[i] == value){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object value) {
        for(int i = 0; i < size; i++){
            if( holder[i] == value){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIteratorSimple(holder);
    }
}
