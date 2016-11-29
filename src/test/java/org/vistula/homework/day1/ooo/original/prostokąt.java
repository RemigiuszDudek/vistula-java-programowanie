package org.vistula.homework.day1.ooo.original;

import java.util.Scanner;

public class prostokąt {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj bok A: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Podaj bok B: ");
        int liczba2 = scanner.nextInt();

        int pole = liczba1*liczba2;
        int obw = 2*liczba1+2*liczba2;

        System.out.println("Pole wynosi: " + pole);
        System.out.println("Obwód wynosi: " + obw);

    }
}