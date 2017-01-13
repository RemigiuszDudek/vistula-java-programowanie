package org.vistula.homework.day2.ddd.original;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    @Test
    public void shouldCorrectlyCalculateField() {
        Triangle triangle = new Triangle(5.5,4.5);
        double expectedField = 12.375;

        double actualField = triangle.field();

        assertThat(actualField).isEqualTo(expectedField);
    }
}