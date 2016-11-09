package org.vistula.dudekre.unittest;

import org.junit.Test;
import org.vistula.dudekre.geometry.Point;

import static org.assertj.core.api.Assertions.assertThat;

public class GeometryTest {
    @Test
    public void cos() {
        //given
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point expectedPointSum = new Point(4, 6);

        //when
        Point p3 = p1.add(p2);

        //then
        assertThat(p3).isEqualToComparingFieldByField(expectedPointSum);
    }
}
