package org.vistula.homework.day2;


import static java.lang.String.format;

public class MultiplicationTable {
    public static void main(String[] args) {
        printHeader();

        for (int x = 0; x <= 10; x++) {
            System.out.print(format("%3d|", x));
            for (int y = 0; y <= 10; y++) {
                System.out.print(format("%3d ", x * y));
            }
            System.out.println();
        }

    }

    private static void printHeader() {
        System.out.print("  x|");
        for (int i = 0; i <= 10; i++) {
            System.out.print(format("%3d|", i));
        }
        System.out.println();
    }
}
