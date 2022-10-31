package com.anandorja.learn;

import junit.framework.TestCase;

public abstract class ListTest extends TestCase {

    IList arr = getList();

    protected abstract IList getList();

    public void testAdd() {
        for(int val = 0; val < 4; ++val){
            arr.add(val);
        }
        assertEquals(4,arr.size());
        assertEquals(3,arr.indexOf(3));
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
        arr.insert(3,5);
        assertEquals(5,arr.get(3));
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
        assertEquals(1,arr.get(1));
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
        boolean bool = arr.contains(2);
        assertTrue(bool);
    }

    public void testDelete() {
        for(int val = 0; val < 3; ++val){
            arr.add(val);
        }
        Object val = arr.delete(2);
        assertEquals(2,val);
    }

    public void testIterator() {
        arr.add(1);
        if(arr.iterator().hasNext()){
            assertEquals(1,arr.iterator().next());
        }
    }

    /**public void testTestDelete() {
        for(int val = 0; val < 3; ++val){
            arr.add(val);
        }
        int weq = 1;
        Object bool = arr.delete(weq);
        assertTrue((Boolean) bool);

    }*/
}