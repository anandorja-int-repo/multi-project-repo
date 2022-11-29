package com.anandorja.learn.lists;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class ListDemoTest extends TestCase {
    ListSubList result = new ListSubList();
    ArrayList<Integer> al = new ArrayList<>();

    public void testListDemo(){
        al.add(10);
        al.add(50);
        al.add(34);
        al.add(90);
        al.add(65);
        al.add(78);
        List<Integer> subList = result.subList(al,2,5);
        assertEquals(3,subList.size());
        assertEquals((Integer)90,subList.get(1));
    }
}