package org.vistula.homework.day1.rrr.original;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        //1. Metoda odwraca słowo (przeanalizujcie klasę StringBuffer)
        //2. Sprawdza czy słowo podane do metody jest równe odwróconemu słowu
        //3. Jeśli tak return true, jeśli nie return false
        //4. Spróbujcie sami dojść do tego, jak zrobić żeby:
        // -  metoda nie zwracała uwagi na wielkość liter
        // -  pusty string nie był palindromem
        // -  string zawierający tylko białe znaki (spacje, tabulacje) nie był palindromem
        if (word.isEmpty()) {
            return false;
        }

        if (word.trim().isEmpty())
            return false;

        String wordLowerCase = word.toLowerCase();
        StringBuffer buffer = new StringBuffer(wordLowerCase);
        String reversedWord = buffer.reverse().toString();
        return reversedWord.equals(wordLowerCase);
    }
}
