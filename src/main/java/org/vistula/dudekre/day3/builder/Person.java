package org.vistula.dudekre.day3.builder;

public class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isEmployed;
    private final boolean isHomewOwner;

    public Person(
            final String newLastName,
            final String newFirstName,
            final String newMiddleName,
            final String newStreetAddress,
            final String newCity,
            final String newState,
            final boolean newIsEmployed,
            final boolean newIsHomeOwner)
    {
        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
        this.isEmployed = newIsEmployed;
        this.isHomewOwner = newIsHomeOwner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", isEmployed=" + isEmployed +
                ", isHomewOwner=" + isHomewOwner +
                '}';
    }
}