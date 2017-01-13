package org.vistula.homework.day2.aaa.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PercentGraderTest {
    @Test
    public void shouldReturn6For100() {
        PercentGrader percentGrader = new PercentGrader(100);

        int expectedResult = 6;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn6For97() {
        PercentGrader percentGrader = new PercentGrader(97);

        int expectedResult = 6;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn6For951() {
        PercentGrader percentGrader = new PercentGrader(95.1);

        int expectedResult = 6;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn5For95() {
        PercentGrader percentGrader = new PercentGrader(95);

        int expectedResult = 5;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn4For80() {
        PercentGrader percentGrader = new PercentGrader(80);

        int expectedResult = 4;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn3For651() {
        PercentGrader percentGrader = new PercentGrader(65.1);

        int expectedResult = 3;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn2For551() {
        PercentGrader percentGrader = new PercentGrader(55.1);

        int expectedResult = 2;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn1For55() {
        PercentGrader percentGrader = new PercentGrader(55);

        int expectedResult = 1;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn1For30() {
        PercentGrader percentGrader = new PercentGrader(30);

        int expectedResult = 1;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn1For01() {
        PercentGrader percentGrader = new PercentGrader(0);

        int expectedResult = 1;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn0For101() {
        PercentGrader percentGrader = new PercentGrader(101);

        int expectedResult = 0;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn0For150() {
        PercentGrader percentGrader = new PercentGrader(150);

        int expectedResult = 0;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn0ForMinus5() {
        PercentGrader percentGrader = new PercentGrader(-5);

        int expectedResult = 0;

        int actualResult = percentGrader.Grade();

        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
