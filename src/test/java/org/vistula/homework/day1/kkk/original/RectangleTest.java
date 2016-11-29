package org.vistula.homework.day1.kkk.original;

/**
 * Created by matgalkowski on 27.11.2016.
 */

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldCorrectlyCalculateField() {
        int expectedResult = 4;
        int sideLenght = 2;
        Assert.assertEquals(expectedResult, Rectangle.field(sideLenght));
    }

    @Test
    public void shouldCorrectlyCalculatePerimeter() {
        int expectedResult = 8;
        int sideLenght = 2;
        Assert.assertEquals(expectedResult, Rectangle.perimeter(sideLenght));
    }
}
