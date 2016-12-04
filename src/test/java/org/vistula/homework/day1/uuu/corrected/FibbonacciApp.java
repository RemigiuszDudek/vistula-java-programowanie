package org.vistula.homework.day1.uuu.corrected;

import java.util.Scanner;

import static org.vistula.homework.day1.uuu.corrected.FibbonacciSeries.fibonacciLoop;
import static org.vistula.homework.day1.uuu.corrected.FibbonacciSeries.fibonacciRecursion;

public class FibbonacciApp {

    public static void main(String args[]) {
        int number;

        System.out.println("Podaj nr wyrazu w ciągu Fibonacciego");

        Scanner odczyt = new Scanner(System.in);
        number = odczyt.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(fibonacciRecursion(i));
        }

        System.out.println("Wartość wyrazu " + number + ". to: " + (fibonacciLoop(number)));
    }
}
