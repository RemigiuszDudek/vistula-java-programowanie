package org.vistula.homework.day2;

import org.vistula.dudekre.people.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remis on 13.01.2017.
 */
public class WorkingClassIndicator {
    public List<Person> getJuniors(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            if (person.age() < 18) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getWorking(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            if (person.age() >= 18 && person.age() <= 67) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getSeniors(List<Person> people) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : people) {
            if (person.age() > 67) {
                result.add(person);
            }
        }
        return result;
    }
}
