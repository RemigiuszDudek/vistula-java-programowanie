package org.vistula.homework.day2.yyy.original; /**
 * Created by Lukasz on 28.12.2016.
 */

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class Rectangle {
    @Test
    public void testField()
    {
        int a = 2;
        int b = 5;
        int expected = 10;
        int result = calculateField(a, b);
        Assert.assertThat(result, is(expected));
    }
    private int calculateField(int a, int b) {
        int result = a * b;
        System.out.println(result);
        return result;
    }
    @Test
    public void testPerimeter(){

        int a = 2;
        int b = 5;
        int expected = 14;
        int result = calculatePerimeter(a, b);
        Assert.assertThat(result, is(expected));

    }
    private int calculatePerimeter(int a, int b) {
        int result = 2*a + 2*b;
        System.out.println(result);
        return result;
    }
}
