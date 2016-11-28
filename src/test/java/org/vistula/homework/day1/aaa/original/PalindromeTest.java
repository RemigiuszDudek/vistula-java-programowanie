package org.vistula.homework.day1.aaa.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PalindromeTest {

    @Test
    public void shouldNotBePalindrome() {
        //given
        Boolean expectedResult = false;
        Palindrome palindrome = new Palindrome();
        //when
        Boolean actualResult = palindrome.isPalindrome("alan");
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldBePalindrome() {
        //given
        Boolean expectedResult = true;
        Palindrome palindrome = new Palindrome();
        //when
        Boolean actualResult = palindrome.isPalindrome("ala");
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldBePalindromeUppercase() {
        //given
        Boolean expectedResult = true;
        Palindrome palindrome = new Palindrome();
        //when
        Boolean actualResult = palindrome.isPalindrome("Kajak");
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldNotBePalindromeEmpty() {
        //given
        Boolean expectedResult = false;
        Palindrome palindrome = new Palindrome();
        //when
        Boolean actualResult = palindrome.isPalindrome("");
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
