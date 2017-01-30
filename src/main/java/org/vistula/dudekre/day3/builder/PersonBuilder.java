package org.vistula.dudekre.day3.builder;

import org.assertj.core.api.Assertions;

public class PersonBuilder {
    private String lastName;
    private String firstName;
    private String middleName;
    private String streetAddress;
    private String city;
    private String state;
    private boolean isEmployed = false; //default value
    private boolean IsHomeOwner = false;

    public static PersonBuilder aPerson() {
        return new PersonBuilder();
    }

    public PersonBuilder withLastName(String LastName) {
        this.lastName = LastName;
        return this;
    }

    public PersonBuilder withFirstName(String FirstName) {
        this.firstName = FirstName;
        return this;
    }

    public PersonBuilder withMiddleName(String MiddleName) {
        this.middleName = MiddleName;
        return this;
    }

    public PersonBuilder withStreetAddress(String StreetAddress) {
        this.streetAddress = StreetAddress;
        return this;
    }

    public PersonBuilder withCity(String City) {
        this.city = City;
        return this;
    }

    public PersonBuilder withState(String State) {
        this.state = State;
        return this;
    }

    public PersonBuilder employed() {
        this.isEmployed = true;
        return this;
    }

    public PersonBuilder owningHome() {
        this.IsHomeOwner = true;
        return this;
    }

    public Person build() {
        Assertions.assertThat(firstName).isNotEmpty();
        Assertions.assertThat(lastName).isNotEmpty();
        return new Person(lastName, firstName, middleName, streetAddress, city, state, isEmployed, IsHomeOwner);
    }
}