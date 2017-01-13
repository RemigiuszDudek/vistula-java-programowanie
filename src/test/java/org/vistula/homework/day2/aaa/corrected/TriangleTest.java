package org.vistula.homework.day2.aaa.corrected;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {
    @Test
    public void shouldHaveField() {
        //given
        int a = 2;
        int h = 5;

        int expectedResult = 5;
        Triangle triangle = new Triangle(a, h);

        //when
        int actualResult = triangle.field();

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldHavePerimeter() {
        //given
        int a = 3;
        int b = 2;
        int c = 3;

        int expectedResult = 8;
        Triangle triangle = new Triangle(a,b,c);

        //when
        int actualResult = triangle.perimeter();

        //then
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    public void shouldHave2Field() {
        //given
        int a = 2;
        int b = 3;
        int c = 3;
        int h = 5;

        int expectedResult = 5;
        Triangle triangle = new Triangle(a,b,c,h);

        //when
        int actualResult = triangle.field();

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
    @Test
    public void shouldHave2Perimeter() {
        //given
        int a = 3;
        int b = 2;
        int c = 3;
        int h = 4;

        int expectedResult = 8;
        Triangle triangle = new Triangle(a,b,c,h);

        //when
        int actualResult = triangle.perimeter();

        //then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
