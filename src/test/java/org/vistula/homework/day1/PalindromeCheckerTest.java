package org.vistula.homework.day1;

import org.junit.Test;

public class PalindromeCheckerTest {
    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który jest palindromem
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest true
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który nie jest palindromem
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest false
    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który jest palindromem i zawiera duże i małe litery
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest true
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz pustego String'a
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest false
    }

    @Test
    public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a złożonego tylko ze spacji i tabulacji
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest false
    }
}
