package org.vistula.homework.day1.hhh.corrected.trianglevalidator;

public class TriangleValidateMessage {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 3;
        TriangleValidator v = new TriangleValidator();
        System.out.println(String.format("Dla podanych boków trójkąta: %d, %d, %d\n"
                + "Wynik jest: %b", a, b, c, v.validate(a, b, c)));
    }
}
