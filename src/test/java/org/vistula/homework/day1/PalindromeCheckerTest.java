package org.vistula.homework.day1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {
    private PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        String palindrome = "aba";

        boolean result = palindromeChecker.isPalindrome(palindrome);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        String nonPalindrome = "abc";

        boolean result = palindromeChecker.isPalindrome(nonPalindrome);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        String palindrome = "Aba";

        boolean result = palindromeChecker.isPalindrome(palindrome);

        assertThat(result).isTrue();
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        // to dla tych którzy chcieli trochę pogrzebać, nie da napisać się kodu tak, by ten test był zielony
        // znając tylko struktury kodu, które poznaliśmy pierwszego dnia
    }

    @Test
    public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
        // to dla tych którzy chcieli trochę pogrzebać, nie da napisać się kodu tak, by ten test był zielony
        // znając tylko struktury kodu, które poznaliśmy pierwszego dnia
    }
}
