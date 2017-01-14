package org.vistula.dudekre.webframework;

public class Singleton {
    public static final String CONSTANT = "stala wartos";
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public boolean returnTrue() {
        return true;
    }
}
