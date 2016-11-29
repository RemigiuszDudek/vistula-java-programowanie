package org.vistula.homework.day1.sss.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by podyplom on 2016-11-06.
 */
public class PalindromeTest {
    @Test //test czy klasa PalindromeChecker zwraca true dla słowa będącego palindromem oraz false w przeciwnym przypadku
    public void checkIfPalindromeTest() {
        PalindromeChecker checker = new PalindromeChecker();
        Assertions.assertThat(checker.checkIfPalindrome("kajak")).isEqualTo(true);
//        Assert.assertTrue(checker.checkIfPalindrome("kajak"));
        Assertions.assertThat(checker.checkIfPalindrome("Kasia")).isEqualTo(false);
    }
}
