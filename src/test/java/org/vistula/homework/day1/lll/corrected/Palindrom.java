package org.vistula.homework.day1.lll.corrected;

/**
 * Created by Karol on 26.11.2016.
 */

import java.util.Scanner;

class Palindrom {
    public boolean isPalindrome(String slowo) {
        String odwrocony = new StringBuilder(slowo).reverse().toString();
        return odwrocony.equalsIgnoreCase(slowo);
    }
}

