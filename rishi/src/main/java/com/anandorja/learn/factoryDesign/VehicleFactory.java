package com.anandorja.learn.factoryDesign;

public class VehicleFactory {
    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Car")){
            return new Car();
        }
        if(type.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        if(type.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        throw new IllegalArgumentException(type);
    }
}
