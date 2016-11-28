package org.vistula.homework.day1.ccc.original;

import org.junit.*;
import static org.junit.Assert.*;

public class WordCheckerTest {

    @Test
    public void notPalindromeIsFalse() {
        //given
        WordChecker wordChecker = new WordChecker();

        //when
        boolean result = wordChecker.isPalindrome("Drzewo");

        //then
        assertFalse(result);
    }

    @Test
    public void emptyWordIsFalse() {
        //given
        WordChecker wordChecker = new WordChecker();

        //when
        boolean result = wordChecker.isPalindrome("");

        //then
        assertFalse(result);
    }

    @Test
    public void kajakIsTrue() {
        //given
        WordChecker wordChecker = new WordChecker();

        //when
        boolean result = wordChecker.isPalindrome("Kajak");

        //then
        assertTrue(result);
    }

    @Test
    public void ossoIsTrue() {
        //given
        WordChecker wordChecker = new WordChecker();

        //when
        boolean result = wordChecker.isPalindrome("osso");

        //then
        assertTrue(result);
    }

    @Test
    public void kojulokIsTrue() {
        //given
        WordChecker wordChecker = new WordChecker();

        //when
        boolean result = wordChecker.isPalindrome("kojulok");

        //then
        assertTrue(result);
    }

}
