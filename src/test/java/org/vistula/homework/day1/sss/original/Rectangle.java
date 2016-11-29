package org.vistula.homework.day1.sss.original;

/**
 * Created by Adams on 2016-11-25.
 */
public class Rectangle{
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //szerokość
    int x;

    //wysokość
    int y;

    //sprawdza, czy podane słowo jest palindromem
    public int calculateFieltd(){
        return x*y;
    }

    public int calculatePerimeter(){
        return x*2 + y*2;
    }
}
