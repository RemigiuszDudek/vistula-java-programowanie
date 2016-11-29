package org.vistula.homework.day1.sss.corrected;

/**
 * Created by Adams on 2016-11-25.
 */
public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculateField() {
        return x * y;
    }

    public int calculatePerimeter() {
        return x * 2 + y * 2;
    }
}
