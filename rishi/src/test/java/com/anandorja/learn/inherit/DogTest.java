package com.anandorja.learn.inherit;

import junit.framework.TestCase;

public class DogTest extends TestCase {
    Animal dog = new Dog("Bow Bow");
    Dog dog2 = new Dog("Bow Bow");
    Animal cat = new Cat("Meow");
    Animal[] animals = {dog,cat};
    public void testDog() {
        String dogSound = dog.getSound();
        assertEquals("Bow Bow",dogSound);
        String catSound = cat.getSound();
        assertEquals("Meow",catSound);
        for (Animal animal: animals ) {
            System.out.println(animal.getSound());
        }
        System.out.println(dog2.say());
        dog2 = (Dog) dog;
//        System.gc();
//        Runtime.getRuntime().gc();
    }
}