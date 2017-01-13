package org.vistula.homework.day2.yyy.original; /**
 * Created by Lukasz on 31.12.2016.
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.core.Is.is;

class Person {
    int age;

    public Person(int a) {
        age = a;
    }

    public int getAge() {
        return this.age;
    }
}

public class WorkStatus {
    /* juniors: [0 - 18)
       working class [18 - 67]
       seniors 67 - infinity)
     */

    @Test
    public void workStatusDivision() {
        List<Person> people = new ArrayList<Person>();
        Person pMinus = new Person(-1);
        people.add(pMinus);
        Person p0 = new Person(0);
        people.add(p0);
        Person p10 = new Person(10);
        people.add(p10);
        Person p17 = new Person(17);
        people.add(p17);
        Person p18 = new Person(18);
        people.add(p18);
        Person p45 = new Person(45);
        people.add(p45);
        Person p66 = new Person(66);
        people.add(p66);
        Person p67 = new Person(67);
        people.add(p67);
        Person p120 = new Person(120);
        people.add(p120);

        List<Person> juniors = getJuniors(people);
        Assert.assertThat(juniors.size(), is(3));
        Assert.assertThat(juniors, hasItems(p0, p10, p17));

        List<Person> workingClass = getWorkingClass(people);
        Assert.assertThat(workingClass, hasItems(p18, p45, p66, p67));
        Assert.assertThat(workingClass.size(), is(4));

        List<Person> seniors = getSeniors(people);
        Assert.assertThat(seniors, hasItems(p120));
        Assert.assertThat(seniors.size(), is(1));
    }

    private List<Person> getSeniors(List<Person> people) {
        List<Person> seniors = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getAge() > 67) {
                seniors.add(person);
            }
        }
        return seniors;
    }

    private List<Person> getWorkingClass(List<Person> people) {
        List<Person> workingClass = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getAge() >= 18 && person.getAge() <= 67) {
                workingClass.add(person);
            }
        }
        return workingClass;
    }

    private List<Person> getJuniors(List<Person> people) {
        List<Person> juniors = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getAge() < 18 && person.getAge() >= 0) {
                juniors.add(person);
            }
        }
        return juniors;
    }
}
