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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
