package com.anandorja.learn.templateDesign;

public class Machine extends Template{
    @Override
    String check() {
        return "Machine Ok";
    }

    @Override
    String start() {
        return "Machine Running";
    }

    @Override
    String stop() {
        return "Machine Stopped";
    }
}
