package org.vistula.dudekre.webframework.webpages;

import org.vistula.dudekre.webframework.CredentialsStore;
import org.vistula.dudekre.webframework.InMemoryCredentials;

public class AdministrationPage extends WebPage {
    private static final String TITLE = "Administration Panel";
    private CredentialsStore inMemoryCredentialsVault = InMemoryCredentials.getInstance();

    public AdministrationPage() {
        super(TITLE);
    }

    public void addUser(String user, String password) {
        inMemoryCredentialsVault.addValidCredentials(user, password);
    }
}
