package org.vistula.dudekre.house;

/**
 * Created by remis on 01.12.2016.
 */
public class WashingMachine implements Switchable {
    public void turnOn() {
        System.out.println("Started washing");
    }

    public void turnOff() {
        System.out.println("Washing machine is turned off");
    }
}
