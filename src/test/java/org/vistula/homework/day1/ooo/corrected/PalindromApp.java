package org.vistula.homework.day1.ooo.corrected;

import java.util.Scanner;

public class PalindromApp {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();

        String original = getOriginalWord();

        if (palindrom.isPalindrome(original)) {
            System.out.println("To słowo jest palindromem.");
        } else {
            System.out.println("To słowo nie jest palindromem.");
        }
    }

    private static String getOriginalWord() {
        System.out.println("Podaj słowo do sprawdzenia: ");
        Scanner src = new Scanner(System.in);
        return src.next();
    }
}
