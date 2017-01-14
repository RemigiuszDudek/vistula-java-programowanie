package org.vistula.dudekre.people;

import org.junit.Test;

public class VariablePassedByReferenceDanger {
    @Test
    public void passingIntegerByReference() {
        Integer i = new Integer(0);
        System.out.println(i);
        manipulate(i);
        System.out.println(i);
    }

    private void manipulate(Integer i) {
        i = 2;
    }

    @Test
    public void passingPersonByReference() {
        Person partner1 = new Person("Kowalski", 1);
        Person partner2 = new Person("Staszewski", 1);

        System.out.println(partner1.name());
        marryTheOtherPerson(partner1, partner2);
        System.out.println(partner1.name());
    }

    private void marryTheOtherPerson(Person partner1, Person partner2) {
        partner1.marry(partner2);
    }


}
