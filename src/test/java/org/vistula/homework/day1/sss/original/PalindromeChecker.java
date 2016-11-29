package org.vistula.homework.day1.sss.original;

/**
 * Created by Adams on 2016-11-25.
 */
public class PalindromeChecker {
//    public PalindromeChecker() {
//        super();
//    }

    //sprawdza, czy podane słowo jest palindromem
    public boolean checkIfPalindrome(String word){
        StringBuilder builder = new StringBuilder(word);
        String reversedWord = builder.reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }
}
