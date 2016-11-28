package org.vistula.homework.day1.aaa.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
    @Test
    public void shouldCalculateFieldCorrectly() {
        Rectangle rectangle = new Rectangle(2, 3);
        int expectedField = 4;

        int actualField = rectangle.field();

        assertThat(actualField).isEqualTo(expectedField);
    }

    @Test
    public void shouldCalculatePerimeterCorrectly() {
        Rectangle rectangle = new Rectangle(2, 1);
        int expectedPerimeter = 6;

        int actualPerimeter = rectangle.perimeter();

        assertThat(actualPerimeter).isEqualTo(expectedPerimeter);
    }
}