package org.vistula.homework.day2.www.corrected;

/**
 * Created by student on 2016-12-04.
 */
public class Person {
    private int age;

    public Person(int age1)
    {
        this.age = age1;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return age == person.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
