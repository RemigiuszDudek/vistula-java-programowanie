package org.vistula.homework.day2.ddd.original;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleValidatorTest {
    @Test
    public void isPossibleToBuildTriangle() {
        TriangleValidator triangle = new TriangleValidator(5,4,7);

        boolean Result = triangle.validate();

        assertThat(Result).isTrue();
    }
}