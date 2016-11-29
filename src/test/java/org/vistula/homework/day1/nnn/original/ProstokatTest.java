package org.vistula.homework.day1.nnn.original;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Anna on 24.11.2016.
 */
public class ProstokatTest {

    @Test
    public void obliczaPoprawniePoleProstokata(){
       Prostokat prostokat = new Prostokat();
        System.out.println("Pole wynosi "+ prostokat.ObliczPole(2, 4)+".");
        int oczekiwanePole = 8;
        int obliczonePole = prostokat.ObliczPole(2,4);
        assertEquals(oczekiwanePole,obliczonePole);

    }

    @Test
    public void obliczaPoprawnieObwodProstokata(){
    Prostokat prostokat = new Prostokat();
    System.out.println("Obwod wynosi "+ prostokat.ObliczObwod(2,4)+".");
        int oczekiwanyObwod = 12;
        int obliczonyObwod = prostokat.ObliczObwod(2,4);
        assertEquals(oczekiwanyObwod,obliczonyObwod);
    }

}
