package com.anandorja.learn;

public class ArrListTest extends ListTest{
    protected IList getList(){
        System.out.println(this.getClass().getName());
        return new ArrList();
    }
}
