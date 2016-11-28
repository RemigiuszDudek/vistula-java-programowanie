package org.vistula.homework.day1.hhh.corrected.rectangle;

public class RecantleField {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);

        System.out.println("Boki prostokata wynosza: " + rectangle.toString());
        System.out.println("Pole prostokata (a * b) = " + rectangle.field());
        System.out.println("Obwod prostokata (2a + 2b) =  " + rectangle.perimeter());
    }
}



