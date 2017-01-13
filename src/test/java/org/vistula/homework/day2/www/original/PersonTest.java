package org.vistula.homework.day2.www.original;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by student on 2016-12-04.
 */
public class PersonTest {
       // private boolean; //zostało z zajęć


    @Test

    public void dividePeopleIntoThreeLists() {

        Person person0 = new Person(11);
        Person person1 = new Person(37);
        Person person2 = new Person(87);
        Person person3 = new Person(24);
        Person person4 = new Person(4);
        Person person5 = new Person(76);
        Person person6 = new Person(17);
        Person person7 = new Person(45);
        Person person8 = new Person(53);
        Person person9 = new Person(100);


        ArrayList<Person> people = new ArrayList<Person>();

        people.add(person0);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);




//        public int getAge(ArrayList<Person>people) {return age;}
//       new String("First Person") =  people.findFirstPerson();

// Moja propozycja prostszego rozwiązania; to rozwiązanie nie sprawdzi się, jeżeli w innej klasie będzie potrzeba wywołać metodę dzielącą osoby na podane kategorie
//        ArrayList<Person> nonWorking = new ArrayList<Person>(); ?
//        for (Person person : people) {
//            if (person.getAge() < 18) {
//                nonWorking.add(person);
//            }
//        }
//        ArrayList<Person> workingClass = new ArrayList<Person>();
//        for (Person person : people) {
//            if (person.getAge() > = 18 && person.getAge() < = 67) {
//                workingClass.add(person);
//            }
//        }
//        ArrayList<Person> retired = new ArrayList<Person>();
//        for (Person person : people) {
//            if (person.getAge() > 67) {
//                retired.add(person);
//            }
//        }
//
// Poniżej rozwiązanie wykonane na podstawie prezentacji:


        ArrayList<Person> nonWorking = getNonWorking(people);
        ArrayList<Person> workingClass = getWorkingClass(people);
        ArrayList<Person> retired = getRetired(people);


//Expected results:
        ArrayList<Person> nonWorkingExpected = new ArrayList<Person>();

        nonWorkingExpected.add(new Person(11));
        nonWorkingExpected.add(new Person(4));
        nonWorkingExpected.add(new Person(17));


        ArrayList<Person> workingClassExpected = new ArrayList<Person>();

        workingClassExpected.add(new Person(37));
        workingClassExpected.add(new Person(24));
        workingClassExpected.add(new Person(45));
        workingClassExpected.add(new Person(53));


        ArrayList<Person> retiredExpected = new ArrayList<Person>();

        retiredExpected.add(new Person(87));
        retiredExpected.add(new Person(76));
        retiredExpected.add(new Person(100));

//Assertions:
        assertThat(nonWorking).isEqualTo(nonWorkingExpected);
        assertThat(workingClass).isEqualTo(workingClassExpected);
        assertThat(retired).isEqualTo(retiredExpected);


//First person with age above 18:
        Person firstPersonWithAgeAbove18 = getFirstPersonWithAgeAboveEighteen(people);

//Expected results:
        Person firstPersonWithAgeAbove18Expected = person1;

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
            if (i > size) {
                return null;
            }
            person = people.get(i);
        }
        return  person;

    }


//    private int findFirstPersonInAgeAboveEighteen(ArrayList<Person> people) {
//        for (Person person : people);
//
//    }

//    private int findFirstPersonInAgeAboveEighteen(ArrayList<Person> people) {
//        int i = 0;
//        while (person.getAge <= 18) {
//            i = i + 1;
//        }
//    }



    private ArrayList<Person> getNonWorking (ArrayList < Person > people) {
            ArrayList<Person> result = new ArrayList<Person>();
            for (Person person : people) {
                if (person.getAge() < 18) {
                    result.add(person);
                }
            }
            return result;
        }


        private ArrayList<Person> getWorkingClass (ArrayList < Person > people) {
            ArrayList<Person> result = new ArrayList<Person>();
            for (Person person : people) {
                if (person.getAge() >= 18 && person.getAge() <= 67) {
                    result.add(person);
                }
            }
            return result;
        }


        private ArrayList<Person> getRetired (ArrayList < Person > people) {
            ArrayList<Person> result = new ArrayList<Person>();
            for (Person person : people) {
                if (person.getAge() > 67) {
                    result.add(person);
                }
            }
            return result;
        }





//Kod poniżej został z zajęć:
//    public void createNewPerson() {
//        int age = 35;
//
//        Person person = new Person(age);
//
//        boolean expected = true;
//        boolean actualAge = person.isPersonInWorkingAge();
//
//        Assertions.assertThat(actualAge).isEqualTo(expected);
//    }



}
