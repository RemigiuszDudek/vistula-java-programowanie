package org.vistula.dudekre.webdriver;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.vistula.dudekre.webdriver.pages.HomePage;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;

public class HomePageTest extends AbstractWebdriverTest {
    private HomePage homePage = new HomePage(webDriver);

    @Test
    public void shouldHaveExpectedPosts() {
        List<String> expectedPostedTitles = of(
                "Good/Bad .vs. Appreciative Inquiry Retrospective",
                "Behaviour Driven Development",
                "Money and self organized teams",
                "Statement coverage .vs. Branch coverage .vs. Path coverage",
                "Agile vs Scrum",
                "Agile vs Waterfall");

        List<String> postedTitles = homePage.go().getPostTitles();

        Assertions.assertThat(postedTitles).containsExactlyElementsOf(expectedPostedTitles);
    }
}
