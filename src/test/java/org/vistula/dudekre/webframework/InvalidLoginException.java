package org.vistula.dudekre.webframework;

public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }

    public InvalidLoginException(Throwable cause) {
        super(cause);
    }
}
