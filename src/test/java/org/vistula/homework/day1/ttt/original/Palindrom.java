package org.vistula.homework.day1.ttt.original;

import org.junit.Test;

public class Palindrom {
    @Test
    public void palindrom() {
        String pal = "kajak";
        String npal = "uczelnia";

        if (isPalindrom(pal))
            System.out.println("Wyraz " + pal + " jest palindromem");
        else
            System.out.println("Wyraz " + pal + " nie jest palindromem");

        if (isPalindrom(npal))
            System.out.println("Wyraz " + npal + " jest palindromem");
        else
            System.out.println("Wyraz " + npal + " nie jest palindromem");
    }

    public boolean isPalindrom(String palindrom) {
        String tmp = new StringBuilder().append(palindrom).reverse().toString();
        if (palindrom.equals(tmp)) {
            return true;
        }
        return false;
    }
}