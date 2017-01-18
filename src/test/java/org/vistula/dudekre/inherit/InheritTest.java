package org.vistula.dudekre.inherit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remis on 14.01.2017.
 */
public class InheritTest {

    @Test
    public void test() {
        List<Animal> animalList= new ArrayList<Animal>();
        Animal cow = new Cow("Mucka", 1000);
        cow.speak();

        Tiger tiger = new Tiger(300);
        tiger.speak();

        animalList.add(cow);
        animalList.add(tiger);
    }
}
