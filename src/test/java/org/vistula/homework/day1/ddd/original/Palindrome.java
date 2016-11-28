package org.vistula.homework.day1.ddd.original;

public class Palindrome {
    public static void main(String[] args) {
        String word = "kajak";
        String result = new StringBuilder(word).reverse().toString();
        if (word.equals(result)) {
            System.out.println(word + " jest palindromem");
        }
        else {
            System.out.println(word + " nie jest palindromem");
        }
    }
}