package com.anandorja.learn.factoryDesign;

import junit.framework.TestCase;

public class FactoryVehicleTest extends TestCase {

    public void testGetVehicle() {
        FactoryVehicle fv = new FactoryVehicle();
        String carShow = fv.getVehicle("Car").show();
        String bikeShow = fv.getVehicle("Bike").show();
        String truckShow = fv.getVehicle("Truck").show();
        assertEquals("Message from a Car Class",carShow);
        assertEquals("Message from a Bike Class",bikeShow);
        assertEquals("Message from a Truck Class",truckShow);
    }
}