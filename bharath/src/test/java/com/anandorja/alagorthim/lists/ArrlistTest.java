package com.anandorja.alagorthim.lists;

import junit.framework.TestCase;



public class ArrlistTest extends TestCase {


    Arrlist val = new Arrlist();

    public void testAdd() {


        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);
        val.add(6);
        val.add(7);
        val.add(8);


        //    System.out.println(val.toString());
        //   System.out.println((val.indexOf(0)).);
        assertEquals(8, val.size());

        assertEquals(8, val.get(7)); // its in Integer object so how can i validate
        //  assertEquals(4, val.get(3));


    }

    public void testClear() {
        val.clear();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);
        val.add(6);
        val.add(7);
        val.add(8);
        val.add(9);
        val.add(10);
        val.add(11);
        assertEquals(11, val.size());
        val.clear();
        assertEquals(0, val.size());


    }

    public void testSize() {

        val.clear();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);
        val.add(6);
        val.add(7);
        val.add(8);

        assertEquals(8, val.size());
        // assertEquals(4, val.get(3));

    }

    public void testIsEmpty() {
        val.clear();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);
        val.add(6);
        val.add(7);
        val.add(8);

        assertEquals(8, val.size());
        assertEquals(false, val.isEmpty());
        val.clear();
        assertEquals(true, val.isEmpty());
        // assertEquals(4, val.get(3));

    }

    public void testcontains() {
        val.clear();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);
        val.add(6);
        val.add(7);
        val.add(8);

        assertEquals(8, val.size());
        assertSame(true, val.contains(5));
        assertSame(false, val.contains(50));
    }

    public void testset() {
        Arrlist val = new Arrlist();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(33);
        val.add(5);
        //    val.set(3,33);
        val.set(3, 44);


        //  assertSame();
        //   val.set(3,33);
        System.out.println(val.get(3));
        //  assertEquals(4,3);
        //   assertEquals(4, val.get(3));
        //   assertEquals(4,val.);

        assertEquals(44, val.get(3));


    }

    public void testdelete() {
        val.clear();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(33);
        val.add(5);
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(33);
        val.add(5);

        assertEquals(10, val.size());
        val.delete(1);
        assertEquals(9, val.size());
        assertEquals(3, val.get(1));


    }

    public void testinsert(){
        val.clear();
        val.add(1);
        val.add(2);
        val.add(4);
        val.add(5);
        assertEquals(4, val.size());
        val.insert(2,3);
       assertEquals(5, val.size());

        assertEquals(3, val.get(2));

       // assertEquals(4, val.size());



    }
    public void  testindexOf(){
        val.clear();
        val.add(1);
        val.add(2);
        val.add(4);
        val.add(5);
        assertEquals(3,val.indexOf(5));

    }

    public void testIterator(){
        val.clear();
        val.add(1);
        val.add(2);
        val.add(3);
        if(val.iterator().hasNext()){
            assertEquals(1,val.iterator().next());
        }
    }
}