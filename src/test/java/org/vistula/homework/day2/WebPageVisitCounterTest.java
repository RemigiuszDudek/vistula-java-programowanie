package org.vistula.homework.day2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebPageVisitCounterTest {
    @Test
   public void countVisits() {
        WebPageVisitCounter webPageVisitCounter = new WebPageVisitCounter();

        webPageVisitCounter.visit("WebPage3");
        webPageVisitCounter.visit("WebPage2");
        webPageVisitCounter.visit("WebPage1");
        webPageVisitCounter.visit("WebPage3");
        webPageVisitCounter.visit("WebPage2");
        webPageVisitCounter.visit("WebPage3");

       assertThat(webPageVisitCounter.numberOfVisits("WebPage0")).isEqualTo(0);
       assertThat(webPageVisitCounter.numberOfVisits("WebPage1")).isEqualTo(1);
       assertThat(webPageVisitCounter.numberOfVisits("WebPage2")).isEqualTo(2);
       assertThat(webPageVisitCounter.numberOfVisits("WebPage3")).isEqualTo(3);
   }
}
