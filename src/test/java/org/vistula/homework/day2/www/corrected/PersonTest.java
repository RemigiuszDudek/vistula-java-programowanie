package org.vistula.homework.day2.www.corrected;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    @Test
    public void dividePeopleIntoThreeLists() {
        Person person11 = new Person(11);
        Person person37 = new Person(37);
        Person person87 = new Person(87);
        Person person24 = new Person(24);
        Person person4 = new Person(4);
        Person person76 = new Person(76);
        Person person17 = new Person(17);
        Person person45 = new Person(45);
        Person person53 = new Person(53);
        Person person100 = new Person(100);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(person11);
        people.add(person37);
        people.add(person87);
        people.add(person24);
        people.add(person4);
        people.add(person76);
        people.add(person17);
        people.add(person45);
        people.add(person53);
        people.add(person100);

        ArrayList<Person> nonWorking = getNonWorking(people);
        ArrayList<Person> workingClass = getWorkingClass(people);
        ArrayList<Person> retired = getRetired(people);

        ArrayList<Person> nonWorkingExpected = new ArrayList<Person>();
        nonWorkingExpected.add(person11);
        nonWorkingExpected.add(person4);
        nonWorkingExpected.add(person17);

        ArrayList<Person> workingClassExpected = new ArrayList<Person>();
        workingClassExpected.add(person37);
        workingClassExpected.add(person24);
        workingClassExpected.add(person45);
        workingClassExpected.add(person53);

        ArrayList<Person> retiredExpected = new ArrayList<Person>();
        retiredExpected.add(person87);
        retiredExpected.add(person76);
        retiredExpected.add(person100);

//Assertions:
        assertThat(nonWorking).isEqualTo(nonWorkingExpected);
        assertThat(workingClass).isEqualTo(workingClassExpected);
        assertThat(retired).isEqualTo(retiredExpected);

//First person with age above 18:
        Person firstPersonWithAgeAbove18 = getFirstPersonWithAgeAboveEighteen(people);

//Expected results:
        Person firstPersonWithAgeAbove18Expected = person37;

//Assertions:
        assertThat(firstPersonWithAgeAbove18).isEqualTo(firstPersonWithAgeAbove18Expected);
    }

    private Person getFirstPersonWithAgeAboveEighteen(ArrayList<Person> people) {
        if (people == null || people.isEmpty()) {
            return null;
        }
        int i = 0;
        int size = people.size();
        Person person = people.get(0);
        while (person.getAge() <= 18) {
            i++;
            if (i >= size) {
                return null;
            }
            person = people.get(i);
        }
        return person;
    }

    private ArrayList<Person> getNonWorking(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                result.add(person);
            }
        }
        return result;
    }

    private ArrayList<Person> getWorkingClass(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getAge() >= 18 && person.getAge() <= 67) {
                result.add(person);
            }
        }
        return result;
    }

    private ArrayList<Person> getRetired(ArrayList<Person> people) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            if (person.getAge() > 67) {
                result.add(person);
            }
        }
        return result;
    }
}
