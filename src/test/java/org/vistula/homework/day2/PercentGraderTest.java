package org.vistula.homework.day2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PercentGraderTest {
    @Test
    public void shouldReturn6For100() {
        PercentGrader percentGrader = new PercentGrader();

        assertThat(percentGrader.grade(100)).isEqualTo(6);
    }

}
