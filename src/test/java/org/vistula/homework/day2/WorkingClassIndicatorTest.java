package org.vistula.homework.day2;

import org.junit.Before;
import org.junit.Test;
import org.vistula.dudekre.people.Person;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkingClassIndicatorTest {
    private List<Person> people = new ArrayList<Person>();
    private List<Person> expectedJuniors = new ArrayList<Person>();
    private List<Person> expectedWorking = new ArrayList<Person>();
    private List<Person> expectedSeniors = new ArrayList<Person>();

    private WorkingClassIndicator workingClassIndicator = new WorkingClassIndicator();

    @Before
    public void init() {
        expectedJuniors.add(new Person("Johnny", 3));
        expectedJuniors.add(new Person("Kate", 17));

        expectedWorking.add(new Person("Patric", 18));
        expectedWorking.add(new Person("Mark", 19));
        expectedWorking.add(new Person("Anna", 66));
        expectedWorking.add(new Person("Anton", 67));

        expectedSeniors.add(new Person("Marry", 68));

        people.addAll(expectedJuniors);
        people.addAll(expectedSeniors);
        people.addAll(expectedWorking);
    }

    @Test
    public void shouldReturnJuniors() {
        List<Person> result = workingClassIndicator.getJuniors(people);
        assertThat(result).containsAll(expectedJuniors);
    }

    @Test
    public void shouldReturnWorking() {
        List<Person> result = workingClassIndicator.getWorking(people);
        assertThat(result).containsAll(expectedWorking);
    }

    @Test
    public void shouldReturnSeniors() {
        List<Person> result = workingClassIndicator.getSeniors(people);
        assertThat(result).containsAll(expectedSeniors);
    }
}