package com.anandorja.learn;

import junit.framework.TestCase;

public class GradeCalculatorTest extends TestCase {
    GradeCalculator grade = new GradeCalculator();
    public void testGrade(){
        assertEquals("D",grade.DetermineGrade(59));
        assertEquals("A+",grade.DetermineGrade(95));
    }

}