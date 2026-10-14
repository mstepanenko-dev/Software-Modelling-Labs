package org.roehampton.sd3.lab3;

public class Staff extends Person {

    private double salary;

    public Staff(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String print() {
        return printName() + " - Salary: £" + salary;
    }
}