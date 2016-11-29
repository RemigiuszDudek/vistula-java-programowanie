package org.vistula.homework.day1.ppp.original;

import java.util.Scanner;

public class palindromy {
    public static void main(String[] args) {
        System.out.println("Podaj słowo: ");
        Scanner src = new Scanner(System.in);
        String original = src.next();
        String reverse = "";
        int lenght = original.length();
        for (int i = lenght - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (reverse.equals(original)) {
            System.out.println("To słowo jest palindromem.");
        } else {
            System.out.println("To słowo nie jest palindromem.");
        }
    }
}
