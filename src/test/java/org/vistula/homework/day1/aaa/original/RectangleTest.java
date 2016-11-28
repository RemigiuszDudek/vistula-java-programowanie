package org.vistula.homework.day1.aaa.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void shouldHaveField() {
        //given
        int a = 2;
        int b = 2;

        int expectedResult = 4;
        Rectangle rectangle = new Rectangle(a, b);
        //when
        int actualResult = rectangle.field();
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    public void shouldHavePerimeter() {
        //given
        int a = 2;
        int b = 1;

        int expectedResult = 6;
        Rectangle rectangle = new Rectangle(a,b);
        //when
        int actualResult = rectangle.perimeter();
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);

    }

}