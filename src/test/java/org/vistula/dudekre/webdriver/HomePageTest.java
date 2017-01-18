package org.vistula.dudekre.webdriver;

import org.junit.Test;
import org.vistula.dudekre.webdriver.pages.HomePage;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;
import static org.assertj.core.api.Assertions.assertThat;

public class HomePageTest extends WebPageTest {
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

        assertThat(postedTitles).containsExactlyElementsOf(expectedPostedTitles);
    }
}
