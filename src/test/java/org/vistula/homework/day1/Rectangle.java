package org.vistula.homework.day1;

import java.security.InvalidParameterException;

import static java.lang.String.format;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new InvalidParameterException(format("Invalid parameters [a=%d, b=%d]", a, b));
        }
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
