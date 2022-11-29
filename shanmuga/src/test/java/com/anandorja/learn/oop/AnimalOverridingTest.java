package com.anandorja.learn.oop;

import junit.framework.TestCase;

public class AnimalOverridingTest extends TestCase {
    AnimalOverriding obj = new AnimalOverriding();
    AnimalOverriding obj1 = new AnimalOverriding.Dog();

    public void testAnimalOverriding(){
        assertEquals("yes", obj.walk());
        assertEquals("no", obj1.walk());
    }

}