package com.anandorja.learn.templateDesign;

public abstract class Template {
    abstract String check();
    abstract String start();
    abstract String stop();
    public final boolean run(){
        System.out.println(check());
        System.out.println(start());
        System.out.println(stop());
        return true;
    }
}
