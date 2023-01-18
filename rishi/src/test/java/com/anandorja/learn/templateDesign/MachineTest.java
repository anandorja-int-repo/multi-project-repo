package com.anandorja.learn.templateDesign;

import junit.framework.TestCase;

public class MachineTest extends TestCase {
    Machine machine = new Machine();
    Ride ride = new Ride();

    public void testRun(){
        assertTrue(machine.run());
        System.out.println("");
        assertTrue(ride.run());
    }

}