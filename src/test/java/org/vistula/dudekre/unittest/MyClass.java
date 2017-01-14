package org.vistula.dudekre.unittest;

/**
 * Created by remis on 14.01.2017.
 */
public class MyClass {
    private String value = "costam";

    public void setValue(String val) {
        value = val;
    }

    @Override
    public String toString() {
        return "MyClass{} " + value;
    }
}
