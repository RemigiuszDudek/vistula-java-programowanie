package org.vistula.homework.day1.aaa.original;

public class Palindrome {
    public boolean isPalindrome (String word){
        if (word.equals(""))
            return false;

        String reverse = new StringBuffer(word)
                .reverse()
                .toString();

        if (word.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
    }
}
