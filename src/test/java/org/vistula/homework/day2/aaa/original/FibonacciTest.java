package org.vistula.homework.day2.aaa.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void shouldReturn1element() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedResult = 1;

        int actualResult = fibonacci.Element(1);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldReturn2element() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedResult = 1;

        int actualResult = fibonacci.Element(2);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldReturn3element() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedResult = 2;

        int actualResult = fibonacci.Element(3);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldReturn6element() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedResult = 8;

        int actualResult = fibonacci.Element(6);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldReturn10element() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedResult = 55;

        int actualResult = fibonacci.Element(10);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldReturn19element() {
        Fibonacci fibonacci = new Fibonacci();

        int expectedResult = 4181;

        int actualResult = fibonacci.Element(19);

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
