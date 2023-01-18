package com.anandorja.learn.templateDesign;

public class Ride extends Template{
    @Override
    String check() {
        return "Ride Ok";
    }

    @Override
    String start() {
        return "Ride Running";
    }

    @Override
    String stop() {
        return "Ride Stopped";
    }
}
