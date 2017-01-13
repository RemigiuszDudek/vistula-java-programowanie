package org.vistula.homework.day2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    @Test
    public void shouldCorrectlyIndicateNumber() {
        Fibonacci result = new Fibonacci();
        long expectedNumber = 55;
        long actualNumber = result.fibonacciSeriesElement(10);
        assertThat(actualNumber).isEqualTo(expectedNumber);
    }
}