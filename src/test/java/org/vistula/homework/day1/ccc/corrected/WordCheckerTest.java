package org.vistula.homework.day1.ccc.corrected;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordCheckerTest {
    @Test
    public void notPalindromeIsFalse() {
        WordChecker wordChecker = new WordChecker();

        boolean result = wordChecker.isPalindrome("Drzewo");

        Assertions.assertThat(result).as("Is 'Drzewo' a palindrome?").isFalse();
    }

    @Test
    public void emptyWordIsNotPalindrome() {
        WordChecker wordChecker = new WordChecker();

        boolean result = wordChecker.isPalindrome("");

        assertFalse(result);
    }

    @Test
    public void kajakIsPalindrome() {
        WordChecker wordChecker = new WordChecker();

        boolean result = wordChecker.isPalindrome("Kajak");

        assertTrue(result);
    }

    @Test
    public void kojulokIsTrue() {
        WordChecker wordChecker = new WordChecker();

        boolean result = wordChecker.isPalindrome("kojulok");

        assertTrue(result);
    }
}
