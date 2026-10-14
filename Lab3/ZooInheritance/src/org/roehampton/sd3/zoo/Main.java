package org.roehampton.sd3.zoo;

import org.roehampton.sd3.zoo.animals.*;

public class Main {

    public static void main(String[] args) {

        AnimalBase lion = new Lion(5, "Simba");
        AnimalBase elephant = new Elephant(10, "Dumbo");
        AnimalBase penguin = new Penguin(3, "Pingu");

        AnimalBase[] animals = {lion, elephant, penguin};

        for (AnimalBase animal : animals) {

            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());

            System.out.println("Sound: " + animal.makeSound());
            System.out.println("Food: " + animal.eatFood());

            System.out.println("-----------------------");
        }
    }
}