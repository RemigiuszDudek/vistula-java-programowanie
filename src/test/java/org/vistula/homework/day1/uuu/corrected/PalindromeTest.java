package org.vistula.homework.day1.uuu.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vistula.homework.day1.uuu.corrected.Palindrome.isPalindrome;

public class PalindromeTest {
    @Test
    public void shouldRecognizePalindromeCorrectly() {
        String word = "kajak";

        boolean result = isPalindrome(word);

        assertThat(result).isTrue();
    }
}
