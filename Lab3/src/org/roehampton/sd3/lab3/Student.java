package org.roehampton.sd3.lab3;

public class Student extends Person {

    private String course;

    public Student(String firstName, String lastName, String course) {
        super(firstName, lastName);
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public String print() {
        return printName() + " - " + course;
    }
}