package org.vistula.homework.day1.ggg.original;

import org.apache.commons.lang3.StringUtils;

public class PalindromeChecker {
	public boolean isPalindrome(String word) {
		word = word.toLowerCase();

		if (StringUtils.isAnyBlank(word))
			return false;

		StringBuffer sb = new StringBuffer(word);
		return word.equals(sb.reverse().toString());
	}
}
