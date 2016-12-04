package org.vistula.homework.day1.uuu.original;

import java.util.Scanner;

public class RectangleS {

    public static void main(String args[]) {

        int a;
        int b;

        System.out.println("Podaj boki prostokąta: ");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();

        Scanner odczyt2 = new Scanner(System.in);
        b = odczyt2.nextInt();

        double field;
        field = a * b;
        System.out.print("Pole prostokąta wynosi: " + field);

        double perimeter;
        perimeter = 2 * a + 2 * b;
        System.out.println(", a obwód: " + perimeter);

    }
}
