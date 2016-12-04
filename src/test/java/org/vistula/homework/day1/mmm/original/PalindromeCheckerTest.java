package org.vistula.homework.day1.mmm.original;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class PalindromeCheckerTest {
    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który jest palindromem
        PalindromeChecker myPalindromChecker = new PalindromeChecker();
        String phrase = "kajak";

        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        boolean result = myPalindromChecker.isPalindrome(phrase);
        boolean expected = true;

        //3. sprawdzam że resultat jest true
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który nie jest palindromem
        PalindromeChecker myPalindromChecker = new PalindromeChecker();
        String phrase = "kaja";

        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        boolean result = myPalindromChecker.isPalindrome(phrase);
        boolean expected = false;

        //3. sprawdzam że resultat jest false
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a, który jest palindromem i zawiera duże i małe litery
        PalindromeChecker myPalindromChecker = new PalindromeChecker();
        String phrase = "KaJak";

        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        boolean result = myPalindromChecker.isPalindrome(phrase);
        boolean expected = true;

        //3. sprawdzam że resultat jest true
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz pustego String'a

        PalindromeChecker myPalindromChecker = new PalindromeChecker();
        String phrase = "";

        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        boolean result = myPalindromChecker.isPalindrome(phrase);
        boolean expected = false;

        //3. sprawdzam że resultat jest false
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
        //1. Tworzę obiekt klasy PalindoromeChecker oraz String'a złożonego tylko ze spacji i tabulacji
        PalindromeChecker myPalindromChecker = new PalindromeChecker();
        String phrase = "   ";

        //2. Wywołuję metodę isPalindrome and obiekcie palindromeChecker i rezultat zapisuję do zmiennej
        boolean result = myPalindromChecker.isPalindrome(phrase);
        boolean expected = false;

        //3. sprawdzam że resultat jest false
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
