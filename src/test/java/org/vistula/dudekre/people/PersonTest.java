package org.vistula.dudekre.people;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {
    @Test
    public void shouldProperlyIndicateWorkingAge() {
        Person person = new Person("John", 18);

        boolean isWorkingAge = person.isInWorkingAge();

        assertThat(isWorkingAge).isTrue();
    }
}