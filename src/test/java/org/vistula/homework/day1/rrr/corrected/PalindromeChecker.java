package org.vistula.homework.day1.rrr.corrected;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        if (word.trim().isEmpty())
            return false;

        String wordLowerCase = word.toLowerCase();
        String reversedWord = new StringBuffer(wordLowerCase).reverse().toString();
        return reversedWord.equals(wordLowerCase);
    }
}
