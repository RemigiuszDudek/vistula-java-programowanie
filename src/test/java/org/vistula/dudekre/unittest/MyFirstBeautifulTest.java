package org.vistula.dudekre.unittest;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MyFirstBeautifulTest {

    @Test
    public void shouldProperlyConcatenate() {
        //given
        String message1 = "First part";
        String message2 = "second part";
        String expected = "First part :: second part";

        //when
        String concatenatedMsgs = laczWiadomosc(message1, message2);

        //then
        Assertions.assertThat(concatenatedMsgs).isEqualTo(expected);
    }

    private String laczWiadomosc(String msgOne, String msgTwo) {
        return msgOne + " :: " + msgTwo;
    }

    @Test
    public void testOfNumbers() {
        int a = 5;
        int b = 6;

        int result = sumowanie(a, b);

        //sprawdź że suma 5 i 6 równa się 11
    }

    private int sumowanie(int a, int b) {
        return 0;
    }


}
