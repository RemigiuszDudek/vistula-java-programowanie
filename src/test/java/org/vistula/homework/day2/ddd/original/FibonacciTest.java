package org.vistula.homework.day2.ddd.original;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    @Test
    public void shouldCorrectlyIndicateNumber() {
        Fibonacci result = new Fibonacci (10);
        long expectedNumber = 55;
        long actualNumber = result.WhatNumberIsIt();

        assertThat(actualNumber).isEqualTo(expectedNumber);
    }
}