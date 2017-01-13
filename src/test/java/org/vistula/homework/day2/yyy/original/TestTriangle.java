package org.vistula.homework.day2.yyy.original;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Lukasz on 04.01.2017.
 */

class Triangle {
    int a;
    int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public double field() {
        double field = this.a * this.h / 2;
        return field;
    }

}

public class TestTriangle {

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle(2, 3);
        Assert.assertThat(triangle.field(), is(3.0));

    }


}
