package com.anandorja.learn;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedIterator implements Iterator {
    LinkedList.Node current;
    LinkedIterator(LinkedList.Node head){
        this.current = head;
    }
    @Override
    public boolean hasNext() {
        if(current != null){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object val = current.data;
        current = current.next;
        return val;
    }
}
