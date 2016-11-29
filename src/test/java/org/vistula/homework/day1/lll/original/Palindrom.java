package org.vistula.homework.day1.lll.original;

/**
 * Created by Karol on 26.11.2016.
 */

import java.util.Scanner;

class Palindrom {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wstaw słowo");
        String slowo = scan.nextLine();
        String odwrocony = "";

        for (int a = slowo.length() - 1; a >= 0; a--)
            odwrocony += slowo.charAt(a);

        if ( odwrocony.equalsIgnoreCase(slowo) )
            System.out.println("To jest Palindrom");
        else System.out.println("To nie jest Palindrom");
    }
}

