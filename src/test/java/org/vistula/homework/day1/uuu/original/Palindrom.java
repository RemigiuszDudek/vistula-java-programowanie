package org.vistula.homework.day1.uuu.original;

public class Palindrom {

    public static void main(String args[]) {

        String original = "kajak";
        System.out.println("Palindrom? " + isPalindrome(original));
    }

    public static boolean isPalindrome (String original){

        String reverse = "";

        int legth = original.length();

        for (int i = legth - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            return true;
        else
            return false;
    }

}
