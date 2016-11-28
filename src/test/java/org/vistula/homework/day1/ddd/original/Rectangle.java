package org.vistula.homework.day1.ddd.original;

public class Rectangle {
    public static void main(String[] args) {
        double x = 6.5;
        double y = 5.5;
        double field = x*y;
        double perimeter = 2*x + 2*y;
        System.out.println("Prostokąt o wymiarach: " + x + " x " + y);
        System.out.println("Pole: " + field);
        System.out.println("Obwód: " + perimeter);
    }

}
