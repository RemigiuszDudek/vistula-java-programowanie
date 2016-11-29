package org.vistula.homework.day1.rrr.original;

/*
 * klasa powinna modelować prostokąt więc powinna
 * zawierać pola definiujące długość/szerokość prostkąta
 */
public class Rectangle {

    private int length;

    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int field() {
        return length * width;
    }

    public int perimeter() {
        return 2 * length + 2 * width;
    }
}
