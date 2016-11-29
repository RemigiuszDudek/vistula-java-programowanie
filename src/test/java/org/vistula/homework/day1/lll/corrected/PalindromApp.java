package org.vistula.homework.day1.lll.corrected;

/**
 * Created by Karol on 26.11.2016.
 */

import java.util.Scanner;

class PalindromApp {
    public static void main(String args[]) {
        Palindrom palindrom = new Palindrom();
        String slowo = getSlowo();

        if (palindrom.isPalindrome(slowo)) {
            System.out.println("To jest Palindrom");
        } else {
            System.out.println("To nie jest Palindrom");
        }
    }

    private static String getSlowo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wstaw słowo");
        return scan.nextLine();
    }
}

