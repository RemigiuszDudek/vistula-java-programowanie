package org.vistula.homework.day1.ccc.original;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void getFieldForRectangle() throws Exception {
        //given
        Rectangle rectangle = new Rectangle(2,3);

        //when
        int field = rectangle.getField();

        //then
        assertEquals(field,6);
    }

    @Test
    public void getPerimeterForRectangle() throws Exception {
        //given
        Rectangle rectangle = new Rectangle(2,3);

        //when
        int perimeter = rectangle.getPerimeter();

        //then
        assertEquals(perimeter,10);
    }

    @Test
    public void getFieldForSquere() throws Exception {
        //given
        Rectangle rectangle = new Rectangle(4,4);

        //when
        int field = rectangle.getField();

        //then
        assertEquals(field,16);
    }

    @Test
    public void getPerimeterForSquere() throws Exception {
        //given
        Rectangle rectangle = new Rectangle(4,4);

        //when
        int perimeter = rectangle.getPerimeter();

        //then
        assertEquals(perimeter,16);
    }

}