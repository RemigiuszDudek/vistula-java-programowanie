package org.vistula.homework.day1.eee.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class rectangle {
    @Test
    public void pole(){
        int a = 5;
        int b = 2;
        int wynik = (10);

        int Mnozenie = mnozenie(a, b);

        Assertions.assertThat(Mnozenie).isEqualTo(wynik);
    }

    private int mnozenie(int a, int b){

        return (10);
    }

    @Test
    public void pole1(){
        int a = 3;
        int b = 3;
        int result = pomnoz(a, b);


    }
    private int pomnoz(int a, int b){
        return a * b;

    }

}