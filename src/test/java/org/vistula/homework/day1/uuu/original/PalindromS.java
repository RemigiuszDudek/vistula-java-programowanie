package org.vistula.homework.day1.uuu.original;

import java.util.Scanner;

public class PalindromS {

    public static void main(String args[]){

        String original, reverse = "";
        Scanner odczyt = new Scanner (System.in);

        System.out.print("Podaj wyraz: ");
        original = odczyt.nextLine();

        int legth = original.length();

        for (int i = legth-1; i>=0; i--)
            reverse = reverse + original.charAt(i);


        if (original.equals(reverse))
            System.out.println("To jest palindrom");
        else
            System.out.println("To nie jest palindrom");

    }
}