package org.vistula.dudekre.web;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class WebPageTest {
    @Test
    public void shouldHaveProperTitle() {
        //given
        String expectedTitle = "some title";
        WebPage page = new WebPage(expectedTitle);

        //when
        String actualTitle = page.getTitle();

        //then
        Assertions.assertThat(actualTitle)
                .isEqualTo(expectedTitle);
    }

}