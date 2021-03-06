package org.vistula.homework.day1.fff.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
    @Test
    public void correctField() {
        //given
        Rectangle r = new Rectangle(2, 5);
        int expectedField = 10;

        //when
        int wynik = r.field();

        //then
        assertThat(wynik).isEqualTo(expectedField);
    }

    @Test
    public void correctPerimeter() {
        Rectangle r = new Rectangle(2, 5);
        int expectedPerimeter = 14;

        int wynik = r.perimeter();

        assertThat(wynik).isEqualTo(expectedPerimeter);
    }
}
