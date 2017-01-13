package org.vistula.homework.day2.ttt.original;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    @Test
    public void workStatusDivision() {
        List<Person> people = new ArrayList<Person>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            people.add(new Person(rand.nextInt(99) + 1));
        }

        showPerson(people, "List of People");

        List<Person> juniors = getJuniors(people);
        showPerson(juniors, "List of Juniors");
        List<Person> workingClass = getWorkingClass(people);
        showPerson(workingClass, "List of WorkingClass");
        List<Person> seniors = getSeniors(people);
        showPerson(seniors, "List of Seniors");

        Person firstPerson = getFirstPerson(people);
        if (firstPerson != null) {
            System.out.println("First Person's age (below 18): " + firstPerson.getAge());
        } else {
            System.out.println("Empty List");
        }

    }

    private List<Person> getSeniors(List<Person> people) {
        List<Person> tmp = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            if (people.get(i).getAge() > 67) {
                tmp.add(people.get(i));
            }
        }
        return tmp;
    }

    private List<Person> getWorkingClass(List<Person> people) {
        List<Person> tmp = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            if (people.get(i).getAge() >= 18 && people.get(i).getAge() <= 67) {
                tmp.add(people.get(i));
            }
        }
        return tmp;
    }

    private List<Person> getJuniors(List<Person> people) {
        List<Person> tmp = new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            if (people.get(i).getAge() < 18) {
                tmp.add(people.get(i));
            }
        }
        return tmp;
    }

    private void showPerson(List<Person> people, String info) {
        System.out.println(info);
        if (people != null) {
            for (int i = 0; i < people.size(); i++) {
                System.out.println("people " + (i + 1) + " age " + people.get(i).getAge());
            }
        } else {
            System.out.println("Empty List");
        }
    }

    private Person getFirstPerson(List<Person> people) {
        int i = 0;
        while (i < 10) {
            if (people.get(i).getAge() < 18) {
                return people.get(i);
            }
            i++;
        }
        return null;
    }
}