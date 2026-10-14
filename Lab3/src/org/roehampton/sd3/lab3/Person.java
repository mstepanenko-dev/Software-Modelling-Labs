package org.roehampton.sd3.lab3;

public abstract class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String printName() {
        return firstName + " " + lastName;
    }
    public abstract String print();
}