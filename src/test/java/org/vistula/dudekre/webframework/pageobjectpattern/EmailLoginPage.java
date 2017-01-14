package org.vistula.dudekre.webframework.pageobjectpattern;

import org.vistula.dudekre.webframework.webpages.WebPage;

public class EmailLoginPage extends WebPage {
    private static final String TITLE = "Email login page";

    public EmailLoginPage() {
        super(TITLE);
    }

    public EmailHomePage validLogin(String email, String password) {
        typeInEmailAndPassword(email, password);
        pressLogInButton();
        return new EmailHomePage();
    }

    public InvalidLoginPage invalidLogin() {
        typeInEmailAndPassword("invalid@invalid.com", "invalid");
        pressLogInButton();
        return new InvalidLoginPage();
    }

    private void pressLogInButton() {
    }

    private void typeInEmailAndPassword(String email, String password) {
    }

}
