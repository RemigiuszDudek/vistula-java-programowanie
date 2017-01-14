package org.vistula.dudekre.unittest;

import org.junit.Test;

/**
 * Created by remis on 14.01.2017.
 */
public class StaticTest {
    @Test
    public void staticTest() {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        obj1.setValue("cos innego");

        System.out.println(obj1);
        System.out.println(obj2);

    }
}
