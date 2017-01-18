package org.vistula.dudekre.webframework;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.vistula.dudekre.webframework.webpages.HomePage;
import org.vistula.dudekre.webframework.webpages.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class PageObjectPatterBasedTest {
    private CredentialsStore credentialsStore = InMemoryCredentials.getInstance();
    private static final String USERNAME = "username";
    private static final String PASSWORD = "pass";

    @Before
    public void init() {
        credentialsStore.addValidCredentials(USERNAME, PASSWORD);
    }

    @Test
    public void shouldBePossibleToLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = loginPage.loginToHomePage(USERNAME, PASSWORD);
    }

    @Test
    public void shouldNotBePossibleToLoginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.loginToHomePage(USERNAME, "invalidPassword");
    }
}
