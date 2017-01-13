package org.vistula.homework.day2.yyy.original; /**
 * Created by Lukasz on 05.01.2017.
 */

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Palindrome {
    public boolean check(String word) {
        if (word.length() == 0) {
            return false;
        }
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            /* word: byk
                  i: 012
            length = 3
             */
            char first = word.charAt(i);
            char last = word.charAt(word.length() - 1 - i);
            isPalindrome = isPalindrome && first == last;
        }
        return isPalindrome;

    }

    @Test
    public void testValidPalindrome() {
        boolean result = check("kajak");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void testNotPalindrome() {
        boolean result = check("sarna");
        Assert.assertThat(result, is(false));
    }

    @Test
    public void oneLetter() {
        boolean result = check("a");
        Assert.assertThat(result, is(true));
    }

    @Test
    public void testEmpty() {
        boolean result = check("");
        Assert.assertThat(result, is(false));
    }
}
