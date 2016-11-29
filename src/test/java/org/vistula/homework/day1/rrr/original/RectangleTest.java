package org.vistula.homework.day1.rrr.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.vistula.homework.day1.Rectangle;

public class RectangleTest {
    @Test
    public void shouldCorrectlyCalculateField() {
        //1. Tworzę obiekt klasy Rectangle, oraz zmienną expectedField z odpowiednią wartością
        //2. Na obiekcie rectangle wywołuję metodę field() i zapisuję rezultat do zmiennej
        //3. Sprawdzam, czy obliczone pole jest równe spodziewanemu

        Rectangle rectangle = new Rectangle(10,20);
        int expectedField = 200;
        int field = rectangle.field();
        Assertions.assertThat(field).isEqualTo(expectedField);
    }

    @Test
    public void shouldCorrectlyCalculatePerimeter() {
        //1. Tworzę obiekt klasy Rectangle, oraz zmienną expectedField z odpowiednią wartością
        //2. Na obiekcie rectangle wywołuję metodę field() i zapisuję rezultat do zmiennej
        //3. Sprawdzam, czy obliczony obwód jest równy spodziewanemu

        Rectangle rectangle = new Rectangle(10,20);
        int expectedPerimeter = 60;
        int perimeter = rectangle.perimeter();
        Assertions.assertThat(perimeter).isEqualTo(expectedPerimeter);
    }
}
