package org.roehampton.sd3.lab1;

public class Student {

    String firstName;
    String lastName;
    int courseId;

    public Student(String firstName, String lastName, int courseId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseId = courseId;
    }

    public String getStudentInfo() {
        return String.format("%s %s is in course %s",
                this.firstName, this.lastName, this.courseId);
    }
}
