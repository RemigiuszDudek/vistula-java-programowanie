package org.vistula.homework.day1.iii.original;

import org.junit.Assert;
import org.junit.Test;

public class PalindromyTest {

    @Test
    public void testJestPalindromem() {
        Assert.assertFalse(Palindromy.jestPalindromem("abc"));
        Assert.assertTrue(Palindromy.jestPalindromem("kajak"));
        Assert.assertTrue(Palindromy.jestPalindromem("ala"));
        Assert.assertEquals(true, Palindromy.jestPalindromem("potop"));
    }

}
