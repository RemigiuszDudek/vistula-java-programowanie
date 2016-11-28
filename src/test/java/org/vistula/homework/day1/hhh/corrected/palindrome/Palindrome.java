package org.vistula.homework.day1.hhh.corrected.palindrome;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word == null || word.trim().isEmpty()) {
            return false;
        }
        String reversedWord = new StringBuffer(word).reverse().toString();
        return reversedWord.equalsIgnoreCase(word);
    }
}
