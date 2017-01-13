package org.vistula.homework.day2.aaa.corrected;


import static java.lang.String.format;

public class MultiplicationTable {
    public void draw() {
        printHeader();

        for (int a = 0; a <= 10; a++) {
            System.out.print(format("%3d|", a));
            for (int b = 0; b <= 10; b++) {
                int wynik = a * b;
                System.out.print(format("%3d ", wynik));
            }
            System.out.println();
        }

    }

    private void printHeader() {
        System.out.print("  x|");
        for (int b = 0; b <= 10; b++) {
            System.out.print(format("%3d|", b));
        }
        System.out.println();
    }
}
