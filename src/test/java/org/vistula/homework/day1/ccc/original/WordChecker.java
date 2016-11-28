package org.vistula.homework.day1.ccc.original;

import java.lang.*;

public class WordChecker {

    public boolean isPalindrome(String inputString) {

        if (inputString.isEmpty()) {
            return false;
        }

        inputString = inputString.toLowerCase();

        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {

            char leftLetter = inputString.charAt(left);
            char rightLetter = inputString.charAt(right);

            if (leftLetter != rightLetter) {
                return false;
            }

            left++;
            right--;
        }
        return true;

    }
}
