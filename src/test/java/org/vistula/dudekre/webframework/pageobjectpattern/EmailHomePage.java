package org.vistula.dudekre.webframework.pageobjectpattern;

import org.vistula.dudekre.webframework.webpages.WebPage;

import java.util.List;

public class EmailHomePage extends WebPage {

    public EmailHomePage() {
        super("");
    }

    public List<Email> getVisibleEmails() {
        return null;
    }

    public EmailLoginPage logout() {
        pressLogoutButton();
        return new EmailLoginPage();
    }

    private void pressLogoutButton() {
    }
}
