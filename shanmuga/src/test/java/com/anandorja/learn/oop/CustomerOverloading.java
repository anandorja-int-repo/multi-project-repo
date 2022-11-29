package com.anandorja.learn.oop;

public class CustomerOverloading {
    public int fillForm(String name,int phone,String maiId) {
        return 1;
    }
    //overloading with 4 arguments
    public int fillForm(String name,int phone,int phone1,String maiId) {
        return 0;
    }
}
