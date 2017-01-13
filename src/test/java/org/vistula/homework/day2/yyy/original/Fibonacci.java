package org.vistula.homework.day2.yyy.original; /**
 * Created by Lukasz on 29.12.2016.
 * fibonacci series (1, 1, 2, 3, 5, 8, ...)
 * i = 3 prefib = 1 fib = 1
 * i = 4 prefib = 2 fib = 3
 * i = 5 prefib = 3 fib = 5
 * i = 6 prefib = 5 fib = 8
 * i = 7 prefib = 8 fib = 13
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class Fibonacci {
    @Test
    public void testFibonacci() {
        int result = calculate(1);
        Assert.assertThat(result, is(1));
    }

    @Test
    public void testFibonacciRange() {

        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 5, 8);
        for (int i = 0; i < expected.size(); i++) {
            int result = calculate(i + 1);
            Assert.assertThat(result, is(expected.get(i)));
        }
    }

    @Test
    public void testFibonacci5() {
        int result = calculate(5);
        Assert.assertThat(result, is(5));
    }

    private int calculate(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        int preFib = 1;
        int fib = 1;
        for (int i = 3; i <= n; i++) {
            int newFib = fib + preFib;
            preFib = fib;
            fib = newFib;

        }
        return fib;
    }
}
