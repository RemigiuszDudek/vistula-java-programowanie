package org.vistula.homework.day1.hhh.corrected.trianglevalidator;

public class TriangleValidator {
    public boolean validate(double a, double b, double c) {
        return a + b > c
                && a + c > b
                && b + c > a;
    }
}

