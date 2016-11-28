package org.vistula.homework.day1.aaa.corrected;

public class PalindromeChecker {
    public boolean isPalindrome (String word){
        if (word.trim().equals("")) return false;

        String reverse = new StringBuffer(word)
                .reverse()
                .toString();

        return word.equalsIgnoreCase(reverse);
    }
}
