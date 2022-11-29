package com.anandorja.learn.oop;

import junit.framework.TestCase;

public class CustomerOverloadingTest extends TestCase {
    CustomerOverloading details = new CustomerOverloading();

    public void testFillForm(){
        assertEquals(1,details.fillForm("Siva",1234,"a@m.com"));
        assertEquals(0,details.fillForm("Siva",1234,123,"a@m.com"));
    }

}