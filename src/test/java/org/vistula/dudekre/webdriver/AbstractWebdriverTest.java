package org.vistula.dudekre.webdriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractWebdriverTest {
    protected static WebDriver webDriver;

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.gecko.driver", "external-dependency/geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    @AfterClass
    public static void cleanWebdriver() {
        webDriver.quit();
    }
}
