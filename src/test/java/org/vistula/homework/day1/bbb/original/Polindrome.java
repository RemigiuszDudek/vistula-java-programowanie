package org.vistula.homework.day1.bbb.original;

public class Polindrome {
    public static boolean isPalindrome(String zmienna) {

        for (int i=0 , j=zmienna.length()-1 ; i<j ; i++ , j-- ) {

            if ( zmienna.charAt(i) != zmienna.charAt(j) ) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("adsakasda"));
    }
}
