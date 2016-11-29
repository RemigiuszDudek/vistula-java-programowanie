package org.vistula.homework.day1.rrr.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.vistula.homework.day1.PalindromeChecker;

public class PalindromeCheckerTest {
    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który jest palindromem
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest true
        org.vistula.homework.day1.PalindromeChecker palindromeChecker = new org.vistula.homework.day1.PalindromeChecker();
        String palindrome = "zakaz";
        boolean result = palindromeChecker.isPalindrome(palindrome);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który nie jest palindromem
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest false
        org.vistula.homework.day1.PalindromeChecker palindromeChecker = new org.vistula.homework.day1.PalindromeChecker();
        String palindrome = "kot";
        boolean result = palindromeChecker.isPalindrome(palindrome);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który jest palindromem i zawiera duże i małe litery
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest true
        org.vistula.homework.day1.PalindromeChecker palindromeChecker = new org.vistula.homework.day1.PalindromeChecker();
        String palindrome = "Anna";
        boolean result = palindromeChecker.isPalindrome(palindrome);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz pustego String'a
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest false
        org.vistula.homework.day1.PalindromeChecker palindromeChecker = new org.vistula.homework.day1.PalindromeChecker();
        String palindrome = "";
        boolean result = palindromeChecker.isPalindrome(palindrome);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a złożonego tylko ze spacji i tabulacji
        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        //3. sprawdzam że resultat jest false
        org.vistula.homework.day1.PalindromeChecker palindromeChecker = new PalindromeChecker();
        String palindrome = " \t \t ";
        boolean result = palindromeChecker.isPalindrome(palindrome);
        Assertions.assertThat(result).isFalse();
    }
}
