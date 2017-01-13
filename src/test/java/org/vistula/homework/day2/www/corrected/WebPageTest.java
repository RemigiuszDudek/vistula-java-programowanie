package org.vistula.homework.day2.www.corrected;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageTest {
    @Test
    public void compareWebPages() {
        WebPage webPage = new WebPage("Forest Jr. Gump");
        WebPage webPage2 = new WebPage("Forest Gump");

        assertThat(webPage).isEqualTo(webPage2);
    }
}
