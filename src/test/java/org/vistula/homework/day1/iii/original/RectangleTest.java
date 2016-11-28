package org.vistula.homework.day1.iii.original;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void obliczPole() {
        Rectangle prostokat1 = new Rectangle(2, 5);
        prostokat1.obliczPole();
        Assert.assertEquals(10, prostokat1.obliczPole());
    }

    @Test
    public void obliczObwod() {
        Rectangle prostokat1 = new Rectangle(4, 7);
        Assert.assertEquals(22, prostokat1.obliczObwod());

        Rectangle prostokat2 = new Rectangle(3,5);
        Assert.assertEquals(16, prostokat2.obliczObwod());

    }

}
