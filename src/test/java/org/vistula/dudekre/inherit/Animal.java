package org.vistula.dudekre.inherit;

public abstract class Animal {
    private int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public abstract void speak();

    public int weight() {
        return weight;
    }
}
