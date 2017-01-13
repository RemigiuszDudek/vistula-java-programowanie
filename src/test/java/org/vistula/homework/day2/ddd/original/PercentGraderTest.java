package org.vistula.homework.day2.ddd.original;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PercentGraderTest {
    @Test
    public void shouldProperlyIndicateGrade() {
        PercentGrader result = new PercentGrader(82);

        int expectedGrade = 4;

        int actualGrade = result.WhatGradeIsIt();

        assertThat(actualGrade).isEqualTo(expectedGrade);
    }
}