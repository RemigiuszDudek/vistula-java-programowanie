package org.vistula.dudekre.webframework;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCredentials implements CredentialsStore, CredentialsValidator {
    private static InMemoryCredentials instance;
    private Map<String, String> credentials = new HashMap<String, String>();

    private InMemoryCredentials() {}

    public static InMemoryCredentials getInstance() {
        if (instance == null) {
            instance = new InMemoryCredentials();
        }
        return instance;
    }

    public boolean validate(String username, String password) {
        boolean isValid = false;
        if (credentials.containsKey(username)) {
            isValid = credentials.get(username).equals(password);
        }
        return isValid;
    }

    public void addValidCredentials(String username, String passwod) {
        credentials.put(username, passwod);
    }

    void reset() {
        credentials = new HashMap<String, String>();
    }
}
