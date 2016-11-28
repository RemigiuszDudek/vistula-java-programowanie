package org.vistula.homework.day1.hhh.corrected.palindrome;

public class Pali {
	public static void main(String[] args) {
		String word = "KaJak";
		String word2 = new StringBuffer(word).reverse().toString();
		
		boolean porownanie = word.equalsIgnoreCase(word2);

		if (porownanie) {
			System.out.println("Słowo " + word + " jest palindromem");
		} else {
			System.out.println("Słowo " + word + " nie jest palindromem");
		}
	}
}
