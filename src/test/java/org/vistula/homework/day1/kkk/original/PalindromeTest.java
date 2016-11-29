package org.vistula.homework.day1.kkk.original;

/**
 * Created by matgalkowski on 27.11.2016.
 */
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void shouldCorrectlyRecognizePalindrome() {
        Assert.assertTrue(Palindrome.checkIfPalindrome("kajak"));
    }

    @Test
    public void shouldCorrectlyRecognizeNonPalindrome() {
        Assert.assertFalse(Palindrome.checkIfPalindrome("someword"));
    }

    @Test
    public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
        Assert.assertTrue(Palindrome.checkIfPalindrome("KAJak"));
    }

    @Test
    public void emptyStringIsNotPalindrome() {
        Assert.assertFalse(Palindrome.checkIfPalindrome(""));
    }

    @Test
    public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
        Assert.assertFalse(Palindrome.checkIfPalindrome("             "));
    }
}
