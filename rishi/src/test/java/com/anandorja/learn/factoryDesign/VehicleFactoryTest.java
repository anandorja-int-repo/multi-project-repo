package com.anandorja.learn.factoryDesign;

import junit.framework.TestCase;

public class VehicleFactoryTest extends TestCase {

    public void testGetVehicle() {
        VehicleFactory fv = new VehicleFactory();
        String carShow = fv.getVehicle("Car").show();
        String bikeShow = fv.getVehicle("Bike").show();
        String truckShow = fv.getVehicle("Truck").show();
        assertEquals("Message from a Car Class",carShow);
        assertEquals("Message from a Bike Class",bikeShow);
        assertEquals("Message from a Truck Class",truckShow);
    }
}