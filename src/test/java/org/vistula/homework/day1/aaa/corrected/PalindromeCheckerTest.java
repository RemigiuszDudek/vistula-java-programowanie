package org.vistula.homework.day1.aaa.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {
    @Test
    public void shouldNotBePalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        Boolean actualResult = palindromeChecker.isPalindrome("alan");

        assertThat(actualResult).isFalse();
    }

    @Test
    public void shouldBePalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        Boolean actualResult = palindromeChecker.isPalindrome("ala");

        assertThat(actualResult).isTrue();
    }

    @Test
    public void shouldBePalindromeUppercase() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        Boolean actualResult = palindromeChecker.isPalindrome("Kajak");

        assertThat(actualResult).isTrue();
    }

    @Test
    public void shouldNotBePalindromeEmpty() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        Boolean actualResult = palindromeChecker.isPalindrome("  ");

        assertThat(actualResult).isFalse();
    }
}
