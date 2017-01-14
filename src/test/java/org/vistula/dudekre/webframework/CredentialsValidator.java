package org.vistula.dudekre.webframework;

public interface CredentialsValidator {
    boolean validate(String username, String password);
}
