package org.vistula.dudekre.geometry;

public class Point {
    private int x;
    private int y;

    public Point(int xCrd, int yCrd) {
        x = xCrd;
        y = yCrd;
    }

    public Point add(Point otherPoint) {
        int newXCrd = this.x + otherPoint.x;
        int newYCrd = this.y + otherPoint.y;
        return new Point(newXCrd, newYCrd);
    }
}
