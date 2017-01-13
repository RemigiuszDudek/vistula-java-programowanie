package org.vistula.homework.day2.ddd.corrected;

public class Fibonacci {
    private long num = 0;
    private long num2 = 1;
    private int n = 10;

    public Fibonacci(int n) {
        this.n = n;
    }

    public long whatNumberIsIt() {
        long fibonacci;
        for (long loop = 0; loop < n; loop++) {
            fibonacci = num + num2;
            num = num2;
            num2 = fibonacci;
        }
        return num;
    }
}