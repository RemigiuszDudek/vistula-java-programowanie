package org.vistula.homework.day1.uuu.original;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class TriangleHeron {
    public static void main(String args[]) {

        int a;
        int b;
        int c;

        System.out.println("Podaj boki trójkąta: ");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();

        Scanner odczyt2 = new Scanner(System.in);
        b = odczyt2.nextInt();

        Scanner odczyt3 = new Scanner(System.in);
        c = odczyt3.nextInt();

        double P;
        double p; //połowa obwodu

        p = (a + b + c) / 2;

        P = sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Pole trójkąta wynosi " + P);
    }
}
