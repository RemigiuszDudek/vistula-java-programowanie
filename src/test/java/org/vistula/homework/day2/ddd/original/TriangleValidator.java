package org.vistula.homework.day2.ddd.original;

public class TriangleValidator {
    private double a;
    private double b;
    private double c;

    public TriangleValidator (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean validate () {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        } else {
            return false;
        }
    }
}