package com.anandorja.learn;

public class GradeCalculator {
    public String DetermineGrade(int numberGrade) {
        if (numberGrade <= 0) {
            throw new IllegalArgumentException("No grade available");
        } else if (numberGrade <= 60) {
            return "D";
        } else if (numberGrade <= 70) {
            return "C";
        } else if (numberGrade <= 80) {
            return "B";
        } else if (numberGrade <= 90) {
            return "A";
        } else if (numberGrade <= 95) {
            return "A+";
        }

        return null;
    }
}