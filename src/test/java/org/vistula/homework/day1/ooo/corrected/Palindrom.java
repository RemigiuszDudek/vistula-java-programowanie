package org.vistula.homework.day1.ooo.corrected;

public class Palindrom {
    public boolean isPalindrome(String word) {
        String reverse = "";
        int lenght = word.length();
        for (int i = lenght - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse.equals(word);
    }
}
