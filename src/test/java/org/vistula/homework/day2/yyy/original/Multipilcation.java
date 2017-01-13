package org.vistula.homework.day2.yyy.original;

/**
 * Created by Lukasz on 05.01.2017.
 */
public class Multipilcation {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                String s = String.format("\t%3d", i * j);
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
