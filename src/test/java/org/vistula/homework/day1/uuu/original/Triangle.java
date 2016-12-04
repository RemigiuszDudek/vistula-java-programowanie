package org.vistula.homework.day1.uuu.original;

import java.util.Scanner;

public class Triangle {

    public static void main(String args[]) {

        int a;
        int h;

        System.out.println("Podaj bok trójkąta i wysokość (lub w przypadku trójkąta prostokątnego przyprostokątne): ");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();

        Scanner odczyt2 = new Scanner(System.in);
        h = odczyt2.nextInt();

        double P;

        P = a * h / 2;

        System.out.println("Pole trójkąta wynosi " + P);
    }
}
