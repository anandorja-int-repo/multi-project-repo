package com.anandorja.learn.methods;

public class ToStringExp {
    String name;
    int id;

    ToStringExp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String sample(String raja, int i) {
        //public String Test() {
        ToStringExp obj = new ToStringExp(name, id);
        //System.out.println(obj);
        //return "yes";
        //return null;
        return null;
    }

    public String toString() {
        return name + " " + id;
    }
}
