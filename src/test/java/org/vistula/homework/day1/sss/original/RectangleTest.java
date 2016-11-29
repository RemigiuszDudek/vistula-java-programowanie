package org.vistula.homework.day1.sss.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by podyplom on 2016-11-06.
 */
public class RectangleTest {

    //stworzenie obiektu klasy Rectangle na potrzeby testów
    Rectangle rectangle = new Rectangle(2, 5);

    @Test //test czy klasa Rectangle prawidłowo oblicza pole powierzchni
    public void calculateFieldTest() {
        Assertions.assertThat(rectangle.calculateFieltd()).isEqualTo(10);
    }

    @Test //test czy klasa Rectangle prawidłowo oblicza obwód
    public void calculatePerimeterTest() {
        Assertions.assertThat(rectangle.calculatePerimeter()).isEqualTo(14);
    }
}
