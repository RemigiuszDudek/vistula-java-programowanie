package org.vistula.dudekre.inherit;

public class Cow extends Animal {
    private String name;

    public Cow(String name, int weight) {
        super(weight);
        this.name = name;
    }

    public void speak() {
        System.out.println("Moooooo!");
    }
}
