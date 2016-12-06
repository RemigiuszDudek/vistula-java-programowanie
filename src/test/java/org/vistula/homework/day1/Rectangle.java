package org.vistula.homework.day1;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int field() {
        return a * b;
    }

    public int perimeter() {
        return 2 * a + 2 * b;
    }
}