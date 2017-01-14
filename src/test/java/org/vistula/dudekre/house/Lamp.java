package org.vistula.dudekre.house;

public class Lamp implements Switchable {
    public void turnOn() {
        System.out.println("Here is the light");
    }

    public void turnOff() {
        System.out.println("Lamp is turned off");
    }
}
