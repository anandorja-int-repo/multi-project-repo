package com.anandorja.learn.oop;

public interface VehicleInterface {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements VehicleInterface {

    int speed;
    int gear;
    public void changeGear(int newGear){

        gear = newGear;
    }

    public void speedUp(int increment){

        speed = speed + increment;
    }
    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements VehicleInterface {

    int speed;
    int gear;

    public void changeGear(int newGear){

        gear = newGear;
    }
    public void speedUp(int increment){

        speed = speed + increment;
    }


    public void applyBrakes(int decrement){

        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}

