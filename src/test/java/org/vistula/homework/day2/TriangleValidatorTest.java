package org.vistula.homework.day2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleValidatorTest {
    @Test
    public void testValidTriangle() {
        TriangleValidator validator = new TriangleValidator();

        boolean actual = validator.validate(2, 3, 4);

        assertThat(actual).isTrue();
    }

    @Test
    public void testInvalidTriangle() {
        TriangleValidator validator = new TriangleValidator();

        boolean actual = validator.validate(1, 2, 3);

        assertThat(actual).isFalse();
    }
}
