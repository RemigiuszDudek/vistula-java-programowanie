package org.vistula.homework.day2;

public class Fibonacci {
    public long fibonacciSeriesElement(int n) {
        long num = 0;
        long num2 = 1;
        long fibonacci;
        for (long loop = 0; loop < n; loop++) {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        return num;
    }
}