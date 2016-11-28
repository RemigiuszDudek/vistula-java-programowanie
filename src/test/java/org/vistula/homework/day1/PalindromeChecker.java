package org.vistula.homework.day1;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        String reversedWord = reverseWord(word);
        return word.equalsIgnoreCase(reversedWord);
    }

    private String reverseWord(String word) {
        return new StringBuffer(word).reverse().toString();
    }
}
