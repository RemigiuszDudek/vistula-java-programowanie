package org.vistula.homework.day1.ggg.corrected;

public class PalindromeChecker {
	public boolean isPalindrome(String word) {
		if (word == null || word.trim().isEmpty()) {
			return false;
		}
		word = word.toLowerCase();

		StringBuilder sb = new StringBuilder(word);
		return word.equals(sb.reverse().toString());
	}
}
