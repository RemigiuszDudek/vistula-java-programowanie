package org.vistula.homework.day2;


import static java.lang.String.format;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                System.out.print(format("%3d ", x * y));
            }
            System.out.println();
        }

    }
}
