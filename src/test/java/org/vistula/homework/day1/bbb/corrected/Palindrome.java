package org.vistula.homework.day1.bbb.corrected;

public class Palindrome {
    public static boolean isPalindrome(String slowo) {
        for (int i = 0, j = slowo.length() - 1; i < j; i++, j--) {
            if (slowo.charAt(i) != slowo.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("adsakasda"));
    }
}
