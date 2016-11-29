package org.vistula.homework.day1.nnn.corrected;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anna on 24.11.2016.
 */
public class ProstokatTest {

    @Test
    public void obliczaPoprawniePoleProstokata() {
        Prostokat prostokat = new Prostokat(2, 4);
        int oczekiwanePole = 8;
        int obliczonePole = prostokat.obliczPole();
        assertEquals(oczekiwanePole, obliczonePole);
    }

    @Test
    public void obliczaPoprawnieObwodProstokata() {
        Prostokat prostokat = new Prostokat(2, 4);
        int oczekiwanyObwod = 12;
        int obliczonyObwod = prostokat.obliczObwod();
        assertEquals(oczekiwanyObwod, obliczonyObwod);
    }
}
