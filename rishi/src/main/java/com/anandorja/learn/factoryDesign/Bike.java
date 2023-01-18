package com.anandorja.learn.factoryDesign;

public class Bike implements Vehicle {

    @Override
    public String show() {
        return "Message from a Bike Class";
    }
}
