package org.vistula.homework.day1.sss.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by podyplom on 2016-11-06.
 */
public class PalindromeTest {
    private PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        String palindrome = "aba";

        boolean result = palindromeChecker.checkIfPalindrome(palindrome);

        assertThat(result).isTrue();
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        String nonPalindrome = "abc";

        boolean result = palindromeChecker.checkIfPalindrome(nonPalindrome);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        String palindrome = "Aba";

        boolean result = palindromeChecker.checkIfPalindrome(palindrome);

        assertThat(result).isTrue();
    }

}
