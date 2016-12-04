package org.vistula.homework.day1.uuu.corrected;

import java.util.Scanner;

public class TriangleValidator {

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

        System.out.println("Trójkąt? " + validate(a,b,c));
    }

    public static boolean validate (int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
