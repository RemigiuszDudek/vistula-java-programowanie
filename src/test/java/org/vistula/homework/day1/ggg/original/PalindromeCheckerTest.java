package org.vistula.homework.day1.ggg.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PalindromeCheckerTest {

	@Test
	public void shouldCorrecttlyRecognizePalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word = "oko";
		boolean expected = true;

		boolean result = pc.isPalindrome(word);

		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldCorrecttlyRecognizeNonPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word1 = "dom";
		boolean expected = false;

		boolean result = pc.isPalindrome(word1);

		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		boolean expected = true;
		String word2 = "KaJak";

		boolean result = pc.isPalindrome(word2);

		Assertions.assertThat(result).isEqualTo(expected);
	}

	@Test
	public void emptyStringIsNotPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		boolean expected = false;
		String word3 = "";

		boolean result = pc.isPalindrome(word3);

		Assertions.assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		boolean expected = false;
		String word4 = "		  ";

		boolean result = pc.isPalindrome(word4);

		Assertions.assertThat(result).isEqualTo(expected);
	}
}
