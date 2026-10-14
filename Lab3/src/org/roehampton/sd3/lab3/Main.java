package org.roehampton.sd3.lab3;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Max", "Stepanenko", "Computer Science");
        System.out.println(student.print());

        Staff staff = new Staff("John", "Smith", 35000);
        System.out.println(staff.print());

        Person person = new Student("John", "Kingsman", "Software Engineering");
        System.out.println(person.print());

        Person employee = new Staff("James", "Bond", 45000);
        System.out.println(employee.print());

        System.out.println(student.printName());
        System.out.println(staff.printName());

            }
        }
