package org.vistula.dudekre.web;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageTest {
    @Test
    public void shouldBeEqualIfTitlesAreTheSame() {
        WebPage p1 = new WebPage("someTitle");
        WebPage p2 = new WebPage("someTitle2");

        assertThat(p1).isEqualTo(p2);
    }

    @Test
    public void shouldNotBeEqualIfTitlesAreNotTheSame() {
        WebPage p1 = new WebPage("someTitle");
        WebPage p2 = new WebPage("someOtherTitle");

        boolean result = p1.equals(p2);

        assertThat(result).isFalse();
    }

    @Test
    public void shouldHaveProperTitle() {
        //given
        String expectedTitle = "some title";
        WebPage page = new WebPage(expectedTitle);

        //when
        String actualTitle = page.getTitle();

        //then
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}