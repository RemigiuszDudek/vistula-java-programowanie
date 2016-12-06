package org.vistula.dudekre.geometry;

import org.junit.Test;

public class PointTest {
    @Test(expected = ClassCastException.class)
    public void shouldThrowExceptionWhenCastingWrongClass() {
        Object a = new Integer(1);
        Point b = (Point)a;
    }

    @Test
    public void equalityTest() {
        Point a = new Point(1, 2);
        Point b = new Point(1, 2);

        System.out.println("a == b :: " + (a == b));
        System.out.println("a.equals(b) :: " + a.equals(b));
        System.out.println(a.equals(new Integer(1)));
    }

    @Test
    public void integerEquality() {
        Integer i = new Integer(4);
        Integer j = new Integer(4);

        System.out.println("i == j: " + (i == j));
        System.out.println("i.equals(j): " + (i.equals(j)));
    }
}
