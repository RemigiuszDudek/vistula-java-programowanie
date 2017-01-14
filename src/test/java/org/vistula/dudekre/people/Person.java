package org.vistula.dudekre.people;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void marry(Person p) {
        this.name = p.name;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public boolean isInWorkingAge() {
        return age >= 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
