package org.vistula.homework.day1.kkk.original;

/**
 * Created by matgalkowski on 27.11.2016.
 */
public class Palindrome {


    public static boolean checkIfPalindrome(String word) {
        word = word.trim();
        if(word.isEmpty())
            return false;

        StringBuffer temp = new StringBuffer(word);
        char c;
        for(int i=0;i<temp.length();i++) {
            c = temp.charAt(i);
            if(!Character.isLetter(c))
                return false;
            else {
                if(!Character.isLowerCase(c)) {
                    c = Character.toLowerCase(c);
                    temp.setCharAt(i, c);
                }
            }
        }
        word = temp.toString();
        if(temp.reverse().toString().equals(word))
            return true;
        else
            return false;


    }
}
