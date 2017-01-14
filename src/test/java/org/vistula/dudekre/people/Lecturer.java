package org.vistula.dudekre.people;

import java.util.Date;

import static org.vistula.dudekre.people.NoticePeriod.THREE_MONTHS;

public class Lecturer extends Person {
    private Date hiringDate;

    public Lecturer(String name, Date hiringDate) {
        super(name, 30);
    }

    public NoticePeriod  noticePeriod() {
        return THREE_MONTHS;
    }
}
