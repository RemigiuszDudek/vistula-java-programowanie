package org.vistula.homework.day1.mmm.original;

import org.junit.Test;
import org.assertj.core.api.Assertions;

public class RectangleTest {
    @Test
    public void shouldCorrectlyCalculateField() {
        //1. Tworzę obiekt klasy Rectangle, oraz zmienną expectedField z odpowiednią wartością
        Rectangle rectangle = new Rectangle();
        rectangle.a = 2;
        rectangle.b = 3;
        int expectedField = 6;

        //2. Na obiekcie rectangle wywołuję metodę field() i zapisuję rezultat do zmiennej
        int result = rectangle.field();

        //3. Sprawdzam, czy obliczone pole jest równe spodziewanemu
        Assertions.assertThat(result).isEqualTo(expectedField);
    }

    @Test
    public void shouldCorrectlyCalculatePerimeter() {
        //1. Tworzę obiekt klasy Rectangle, oraz zmienną expectedField z odpowiednią wartością
        Rectangle rectangle = new Rectangle();
        rectangle.a = 2;
        rectangle.b = 3;
        int expectedPerimeter = 10;

        //2. Na obiekcie rectangle wywołuję metodę field() i zapisuję rezultat do zmiennej
        int result = rectangle.field();

        //3. Sprawdzam, czy obliczony obwód jest równy spodziewanemu
        Assertions.assertThat(result).isEqualTo(expectedPerimeter);
    }
}
