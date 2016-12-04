package org.vistula.homework.day1.uuu.original;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TriangleIsosceles {

    public static void main(String args[]) {

        int a;
        int b;

        System.out.println("Podaj podstawę trójkąta równoramiennego oraz ramię: ");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();

        Scanner odczyt2 = new Scanner(System.in);
        b = odczyt2.nextInt();

        double h;

        h = sqrt(pow(b, 2) - pow(a/2, 2));

        double P;

        P = a * h / 2;

        System.out.println("Pole trójkąta wynosi " + P);
    }
}
