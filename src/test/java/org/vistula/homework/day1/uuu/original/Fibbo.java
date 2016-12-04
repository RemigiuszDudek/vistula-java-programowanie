package org.vistula.homework.day1.uuu.original;


import java.util.Scanner;

public class Fibbo {

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

    public static int fibonacciRecursion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;
    }


}
