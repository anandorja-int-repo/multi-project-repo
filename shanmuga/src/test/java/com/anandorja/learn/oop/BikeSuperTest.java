package com.anandorja.learn.oop;

import junit.framework.TestCase;


public class BikeSuperTest extends TestCase {
    Pulsar speed = new Pulsar();
 public  void testBikeSpeed(){
     assertEquals(150,speed.display());
 }
}