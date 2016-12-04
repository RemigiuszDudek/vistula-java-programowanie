package org.vistula.homework.day1.uuu.corrected;

public class Palindrome {
    public static boolean isPalindrome (String original){
        String reverse = "";

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        return original.equals(reverse);
    }
}
