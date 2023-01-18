package com.anandorja.learn.factoryDesign;

public class Truck implements Vehicle{

    @Override
    public String show() {
        return "Message from a Truck Class";
    }
}
