package org.vistula.homework.day1.ggg.corrected;

public class Rectangle {
    private int lenght;
    private int width;

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public int field() {
        return lenght * width;
    }

    public int permiter() {
        return (2 * lenght) + (2 * width);
    }

}
