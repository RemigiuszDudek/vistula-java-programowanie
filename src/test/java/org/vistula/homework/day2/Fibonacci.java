package org.vistula.homework.day2;

public class Fibonacci {
    public long fibonacciSeriesElement(int n) {
        long element1 = 0;
        long element2 = 1;
        long fibonacci;
        for (int i = 0; i < n; i++) {
            fibonacci = element1 + element2;
            element1 = element2;
            element2 = fibonacci;
        }
        return element1;
    }
}