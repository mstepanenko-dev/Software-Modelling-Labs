package org.roehampton.sd3.lab1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Types and variable declarations
        int a = 42;
        int b = 119;
        int c = a + b;
        System.out.println("a + b = " + c);

        // Arrays / ArrayList and loops
        ArrayList<String> myList = new ArrayList<>();
        myList.add("cat");
        myList.add("dog");
        myList.add("rabbit");

        // Basic debugging: inspect the whole list
        System.out.println("Animal list: " + myList);

        for (String listElement : myList) {
            System.out.println(
                    "Index " + myList.indexOf(listElement) + ": " + listElement
            );
        }

        // Conditionals
        ArrayList<String> numberNames = new ArrayList<>();
        numberNames.add("one");
        numberNames.add("two");
        numberNames.add("three");

        for (String listElement : numberNames) {
            if (listElement.equals("three")) {
                System.out.println("Got three");
            } else if (listElement.equals("two")) {
                System.out.println("Got two");
            } else {
                System.out.println("Got something else");
            }
        }

        // Create Student objects
        Student s1 = new Student("Lisa", "Haskel", 1);
        Student s2 = new Student("Youseef", "Tahir", 2);

        System.out.println(s1.getStudentInfo());
        System.out.println(s2.getStudentInfo());
    }
}
