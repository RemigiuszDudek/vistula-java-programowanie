package org.vistula.homework.day1.ccc.corrected;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void getFieldForRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);

        int field = rectangle.getField();

        assertEquals(field, 6);
    }

    @Test
    public void getPerimeterForRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(2, 3);

        int perimeter = rectangle.getPerimeter();

        assertEquals(perimeter, 10);
    }

    @Test
    public void getFieldForSquere() throws Exception {
        Rectangle rectangle = new Rectangle(4, 4);

        int field = rectangle.getField();

        assertEquals(field, 16);
    }

    @Test
    public void getPerimeterForSquere() throws Exception {
        Rectangle rectangle = new Rectangle(4, 4);

        int perimeter = rectangle.getPerimeter();

        assertEquals(perimeter, 16);
    }
}