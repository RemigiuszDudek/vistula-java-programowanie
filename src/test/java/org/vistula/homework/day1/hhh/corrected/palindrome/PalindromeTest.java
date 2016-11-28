package org.vistula.homework.day1.hhh.corrected.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
	Palindrome p = new Palindrome();

	@Test
	public void testPalindrome() {
		String a = "kajak";
		boolean result = p.isPalindrome(a);
		assertEquals(true, result);
	}

	@Test
	public void testNonPalindrome() {
		String a = "buty";
		boolean result = p.isPalindrome(a);
		assertEquals(false, result);
	}

	@Test
	public void testPalindromeBigLetter() {
		String a = "Łamał";
		boolean result = p.isPalindrome(a);
		assertEquals(true, result);
	}

	@Test
	public void testPalindromeEmpty() {
		String a = "";
		boolean result = p.isPalindrome(a);
		assertEquals(false, result);
	}

	@Test
	public void testPalindromeWhiteChar() {
		String a = "	   ";
		boolean result = p.isPalindrome(a);
		assertEquals(false, result);
	}
}
