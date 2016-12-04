package org.vistula.homework.day1.uuu.original;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TriangleEquilateral {

    public static void main(String args[]) {

        int a;

        System.out.println("Podaj bok trójkąta równobocznego: ");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();

        double P;

        P = pow(a,2)*sqrt(3)/4;

        System.out.println("Pole trójkąta równobocznego o boku " + a + " wynosi " + P);
    }
}
