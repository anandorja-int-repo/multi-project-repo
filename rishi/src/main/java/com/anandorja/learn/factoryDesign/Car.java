package com.anandorja.learn.factoryDesign;

public class Car implements Vehicle {

    @Override
    public String show() {
        return "Message from a Car Class";
    }
}
