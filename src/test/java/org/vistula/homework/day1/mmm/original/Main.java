package org.vistula.homework.day1.mmm.original;

public class Main {

    public static void main(String[] args)
    {
        // tworzymy nowy obiekt Palindrome checker
        PalindromeChecker mojPalindromChecker1 = new PalindromeChecker();

        // wykonaj czynnosc isPalindrome i przypisz wynik do zmiennej result
        boolean result = mojPalindromChecker1.isPalindrome("mamam");

        // wypisz wynik na standardowe wyjscie
        System.out.println(result);


        Rectangle prostokat = new Rectangle();

        int pole = prostokat.field();
        int obwod = prostokat.perimeter();

        System.out.println(pole);
        System.out.println(obwod);
    }
}
