package org.vistula.homework.day2.aaa.corrected;

public class Triangle {

    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    public Triangle(int a, int h) {
        this.a=a;
        this.h=h;
    }

    public Triangle(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public int field() {
        return 1/2*a*h;
    }

    public int perimeter() {
        return a+b+c;
    }
}
