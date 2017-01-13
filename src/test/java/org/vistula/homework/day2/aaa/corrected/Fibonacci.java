package org.vistula.homework.day2.aaa.corrected;

public class Fibonacci {
    public int element(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            int left = 1;
            int right = 1;
            int result = 0;
            for (int i = 3; i <= n; i++) {
                result = left + right;
                left = right;
                right = result;
            }
            return result;
        }
    }
}
