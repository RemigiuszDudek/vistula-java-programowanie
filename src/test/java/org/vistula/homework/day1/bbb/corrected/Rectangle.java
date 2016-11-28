package org.vistula.homework.day1.bbb.corrected;

public class Rectangle {
    private double a = 10;
    private double b = 12;

    public double field() {
        return a * b;
    }

    public double perimeter() {
        return 2 * a + 2 * b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.println("Pole prostokata wynosi = " + rectangle.field());
        System.out.println("Obwod prostokata wynosi = " + rectangle.perimeter());
    }
}
