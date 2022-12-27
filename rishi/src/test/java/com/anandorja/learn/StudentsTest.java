package com.anandorja.learn;

import junit.framework.TestCase;

public class StudentsTest extends TestCase {


    public void testAddStudent() {
        Students classStudents = new Students();
        classStudents.addStudent("rishi");
        assertEquals(1,classStudents.getStudents().size());
        assertEquals("rishi",classStudents.getStudents().get(0));
    }

    public void testGetStudents() {
        Students classStudents = new Students();
        classStudents.addStudent("rishi");
        assertEquals(1,classStudents.getStudents().size());
        assertEquals("rishi",classStudents.getStudents().get(0));
//        classStudents.getStudents().add(0,"naveen");
//        assertEquals(2,classStudents.getStudents().size());
    }
}