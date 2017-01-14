package org.vistula.dudekre.webframework.webpages;

import org.vistula.dudekre.webframework.CredentialsValidator;
import org.vistula.dudekre.webframework.InMemoryCredentials;
import org.vistula.dudekre.webframework.InvalidLoginException;

public class LoginPage extends WebPage {
    private static final String TITLE = "Login page";
    private CredentialsValidator inMemoryCredentials = InMemoryCredentials.getInstance();

    public LoginPage() {
        super(TITLE);
    }

    public AdministrationPage loginToAdministrationPage() {
        return new AdministrationPage();
    }

    public HomePage loginToHomePage(String username, String password) {
        if (inMemoryCredentials.validate(username, password)) {
            return new HomePage();
        } else {
            throw new InvalidLoginException("Provided credentials are invalid");
        }
    }
}
