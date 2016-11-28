package org.vistula.homework.day1.eee.corrected;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Rectangle {
    @Test
    public void pole() {
        int a = 5;
        int b = 2;
        int wynikSpodziewany = 10;

        int wynikFaktyczny = mnozenie(a, b);

        Assertions.assertThat(wynikFaktyczny).isEqualTo(wynikSpodziewany);
    }

    private int mnozenie(int a, int b) {
        return (10);
    }

    @Test
    public void pole1() {
        int a = 3;
        int b = 3;
        int result = pomnoz(a, b);
    }

    private int pomnoz(int a, int b) {
        return a * b;
    }
}