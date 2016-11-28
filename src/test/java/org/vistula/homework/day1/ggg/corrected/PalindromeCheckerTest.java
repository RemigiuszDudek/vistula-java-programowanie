package org.vistula.homework.day1.ggg.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeCheckerTest {

	@Test
	public void shouldCorrectlyRecognizePalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word = "oko";

		boolean result = pc.isPalindrome(word);

		assertThat(result).isTrue();
	}

	@Test
	public void shouldCorrectlyRecognizeNonPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word1 = "dom";

		boolean result = pc.isPalindrome(word1);

		assertThat(result).isFalse();
	}

	@Test
	public void shouldBeCaseInsensitiveWhenRecognizingPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word2 = "KaJak";

		boolean result = pc.isPalindrome(word2);

		assertThat(result).isTrue();
	}

	@Test
	public void emptyStringIsNotPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word3 = "";

		boolean result = pc.isPalindrome(word3);

		assertThat(result).isFalse();
	}
	
	@Test
	public void stringContainingOnlyWhiteCharactersIsNotPalindrome() {
		PalindromeChecker pc = new PalindromeChecker();
		String word4 = "		  ";

		boolean result = pc.isPalindrome(word4);

		assertThat(result).isFalse();
	}
}
