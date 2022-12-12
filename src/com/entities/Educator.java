package com.entities;

public class Educator extends BaseEntity {
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Educator(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
