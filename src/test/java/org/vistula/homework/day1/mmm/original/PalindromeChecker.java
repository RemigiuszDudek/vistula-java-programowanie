package org.vistula.homework.day1.mmm.original;

/**
 * Created by Iza on 2016-11-23.
 */
public class PalindromeChecker {

    boolean isPalindrome(String phrase)
    {
        // usuń puste znaki na końcu wyrazu
        phrase = phrase.trim();

        if(phrase == null)
            return false;

        // sprawdź czy wyraz jest pusty
        if(phrase.isEmpty())
            return false;

        // zamień znaki na duże litery
        phrase = phrase.toUpperCase();

        // zamien wyraz na tablicę znaków
        char[] phraseArray = phrase.toCharArray();

        // zmienna pomocnicza do czytania liter od końca wyrazu
        int j = phrase.length()-1;

        // ustalamy srodek petli aby sprawdzac litery do srodka
        int phraseMiddle = phrase.length() / 2;

        // pętla w której bierzemy kolejną literę i porównujemy z liteą od końca wyrazu
        for(int i=0; i < phraseMiddle; i++) {

            if (phraseArray[i] != phraseArray[j])
                return false;

            j--;
        }

        return  true;
    }
}
