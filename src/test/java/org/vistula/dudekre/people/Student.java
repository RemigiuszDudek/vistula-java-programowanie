package org.vistula.dudekre.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<Integer> grades = new ArrayList<Integer>();

    public Student(String name) {
        super(name, 20);
    }

    public void addGrade(Integer grade) {
        grades.add(grade);
    }

    public float gradeAverage() {
        return 0;
    }
}
