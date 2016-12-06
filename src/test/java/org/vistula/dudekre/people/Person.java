package org.vistula.dudekre.people;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public boolean isInWorkingAge() {
        if (age >= 18 && age <=67) {
            return true;
        } else {
            return false;
        }
    }
}
