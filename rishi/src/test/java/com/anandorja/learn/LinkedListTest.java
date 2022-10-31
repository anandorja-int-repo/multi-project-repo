package com.anandorja.learn;

public class LinkedListTest extends ListTest {

    protected IList getList(){
        System.out.println(this.getClass().getName());
        return new LinkedList();
    }
}