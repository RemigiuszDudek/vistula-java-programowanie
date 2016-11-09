package org.vistula.dudekre.webdriver.pages;

import com.google.common.collect.ImmutableList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends WebPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage go() {
        driver.get("http://testersthoughtsuncombed.blogspot.com/");
        return this;
    }

    public List<String> getPostTitles() {
        List<WebElement> elements = driver.findElements(By.xpath("//h3[@class='post-title entry-title']"));
        ImmutableList.Builder<String> postTitles = ImmutableList.builder();
        for (WebElement element : elements) {
            postTitles.add(element.getText());
        }
        return postTitles.build();
    }

}
