package org.vistula.homework.day2.aaa.original;

import org.assertj.core.api.Assertions;
import org.junit.Test; 

public class TriangleValidatorTest { 

    @Test
    public void testValidateTrue() {
        TriangleValidator validator = new TriangleValidator();

        boolean actualResult = validator.Validate(2, 3, 4);

        Assertions.assertThat(actualResult).isEqualTo(true);
	}

    @Test
    public void testValidateTrueFloatingPointNumbers() {
        TriangleValidator validator = new TriangleValidator();

        boolean actualResult = validator.Validate(4.2, 2.3, 6.1);

        Assertions.assertThat(actualResult).isEqualTo(true);
    }

    @Test
    public void testValidateFalseAB() {
        TriangleValidator validator = new TriangleValidator();

        boolean actualResult = validator.Validate(1, 3, 5);

        Assertions.assertThat(actualResult).isEqualTo(false);
    }

    @Test
    public void testValidateFalseAC() {
        TriangleValidator validator = new TriangleValidator();

        boolean actualResult = validator.Validate(2, 6, 3);

        Assertions.assertThat(actualResult).isEqualTo(false);
    }

    @Test
    public void testValidateFalseBC() {
        TriangleValidator validator = new TriangleValidator();

        boolean actualResult = validator.Validate(6, 2, 3);

        Assertions.assertThat(actualResult).isEqualTo(false);
    }

    @Test
    public void testValidateFalseEdgeCase() {
        TriangleValidator validator = new TriangleValidator();

        boolean actualResult = validator.Validate(7, 3, 4);

        Assertions.assertThat(actualResult).isEqualTo(false);
    }
}

