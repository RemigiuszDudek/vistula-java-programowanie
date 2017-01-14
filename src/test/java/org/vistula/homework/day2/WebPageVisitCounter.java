package org.vistula.homework.day2;

import java.util.HashMap;
import java.util.Map;

public class WebPageVisitCounter {
    private HashMap<String, Integer> visits = new HashMap<String, Integer>();

    public void visit(String title) {
        visits.put(title, numberOfVisits(title) + 1);
    }

    public int numberOfVisits(String title) {
        Integer count = visits.get(title);
        if (count == null) {
            return 0;
        } else {
            return count;
        }
    }
}
