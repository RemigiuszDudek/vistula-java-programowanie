package org.vistula.homework.day1.sss.corrected;

/**
 * Created by Adams on 2016-11-25.
 */
public class PalindromeChecker {
    public boolean checkIfPalindrome(String word){
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}
