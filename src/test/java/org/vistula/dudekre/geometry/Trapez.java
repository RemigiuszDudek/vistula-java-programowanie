package org.vistula.dudekre.geometry;

public class Trapez {
    private int a;
    private int b;
    private int h;

    public Trapez(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public float field() {
        return (a+b)*h/2;
    }
}
