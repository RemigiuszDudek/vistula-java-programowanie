package org.vistula.dudekre.unittest;

import org.junit.Test;
import org.vistula.dudekre.geometry.Point;
import org.vistula.dudekre.other.Puppy;
import org.vistula.dudekre.other.WashingMashine;

public class GeometryTest {
    @Test
    public void cos() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = p1.add(p2);
    }

    @Test
    public void wm() {
        Puppy puppy = new Puppy("Azor");
    }







}
