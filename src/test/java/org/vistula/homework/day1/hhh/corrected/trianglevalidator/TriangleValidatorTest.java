package org.vistula.homework.day1.hhh.corrected.trianglevalidator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleValidatorTest {
    @Test
    public void testValidate() {
        TriangleValidator v = new TriangleValidator();

        boolean actual = v.validate(2, 3, 4);

        assertEquals(true, actual);
    }

}
