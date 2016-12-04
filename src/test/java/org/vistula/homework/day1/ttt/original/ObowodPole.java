package org.vistula.homework.day1.ttt.original;

import org.junit.Test;

public class ObowodPole {
    @Test
    public void obwpole() {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double h = 4.0;

        System.out.println("Obwod: " + obwod(a,b,c));

        System.out.println("Pole: " + pole(a,h));
    }

    public double obwod (double a, double b, double c){
        return a+b+c;
    }

    public double pole (double a, double h){
        return ((a*h)/2);
    }
}