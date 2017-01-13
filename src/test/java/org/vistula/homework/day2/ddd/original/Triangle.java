package org.vistula.homework.day2.ddd.original;

public class Triangle {
    private double area;
    private double high;

    public Triangle (double area, double high) {
        this.area = area;
        this.high = high;
    }
    public double field() {
        return 0.5*area*high;
    }
}