package org.vistula.homework.day1.hhh.original.palindrome;

public class Pali {

	public static void main(String[] args) {
		String word = "KaJak";
		String word2 = new StringBuffer(word).toString();
		
		boolean porownanie = word.equalsIgnoreCase(word2);

		if (porownanie == true) {

			System.out.println("S�owo " + word + " jest palindromem");

		} else {
			System.out.println("S�owo " + word + " nie jest palindromem");
		}

	}
}
