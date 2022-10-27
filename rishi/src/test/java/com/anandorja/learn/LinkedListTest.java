package com.anandorja.learn;

import junit.framework.TestCase;

import java.util.Iterator;

public class LinkedListTest extends TestCase {
    LinkedList arr = new LinkedList();

    public void testAdd() {
        for(int val = 0; val < 4; ++val){
            arr.add(val);
        }
        assertEquals(4,arr.size());
        assertEquals(1,arr.get(1));
        assertEquals(0,arr.indexOf(0));
    }

    public void testClear() {
        arr.add(45);
        arr.clear();
        assertEquals(0,arr.size());
    }

    public void testSize() {
        for(int val = 0; val < 4; ++val){
            arr.add(val);
        }
        int size = arr.size();
        assertEquals(4,size);
    }

    public void testIsEmpty() {
        boolean bool = arr.isEmpty();
        assertTrue(bool);
    }

    public void testInsert() {
        for(int val = 0; val < 4; ++val){
            arr.add(val);
        }
        arr.insert(2,5);
        assertEquals(5,arr.get(2));
    }

    public void testSet() {
        for(int val = 0; val < 3; ++val){
            arr.add(val);
        }
        arr.set(1,5);
        assertEquals(5,arr.get(1));
    }

    public void testGet() {
        for(int val = 0; val < 3; ++val){
            arr.add(val);
        }
        assertEquals(2,arr.get(2));
    }

    public void testIndexOf() {
        for(int val = 0; val < 3; ++val){
            arr.add(val);
        }
        assertEquals(1,arr.indexOf(1));
    }

    public void testContains() {
        for(int val = 0; val < 3; ++val){
            arr.add(val);
        }
        boolean bool = arr.contains(1);
        assertTrue(bool);
    }

    public void testDelete() {
        for(int val = 0; val < 4; ++val){
            arr.add(val);
        }
        Object val = arr.delete(3);
        assertEquals(3,val);
    }

    public void testIterator() {
        arr.add(1);
        if(arr.iterator().hasNext()){
            Iterator val;
            val = arr.iterator();
            assertEquals(1,val.next());
        }
    }
}