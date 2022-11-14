package com.anandorja.learn.oop;

public class AnimalOverriding {
    String walk(){
        return "yes";
    }
    static class Dog extends AnimalOverriding{
        String walk(){
            return "no";
        }

    }
}
