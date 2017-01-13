package org.vistula.dudekre.geometry;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TrapezTest {
    @Test
    public void shouldCalculateField() {
        Trapez trapez = new Trapez(1, 3, 2);
        float expectedField = 4;

        float actualField = trapez.field();

        Assertions.assertThat(actualField).isEqualTo(expectedField);
    }
}
