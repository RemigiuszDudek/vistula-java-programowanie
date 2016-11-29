package org.vistula.homework.day1.nnn.corrected;

/**
 * Created by Anna on 24.11.2016.
 */
public class Prostokat {
    private int a;
    private int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int obliczPole() {
        return a * b;
    }

    public int obliczObwod() {
        return 2 * a + 2 * b;
    }
}

