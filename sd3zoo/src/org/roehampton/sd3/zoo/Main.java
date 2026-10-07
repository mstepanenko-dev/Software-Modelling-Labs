package org.roehampton.sd3.zoo;

import org.roehampton.sd3.zoo.animals.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion(5, "Simba");
        Elephant elephant = new Elephant(10, "Dumbo");

        // Demonstrate properties, getters and setters
        System.out.println(lion.getName() + " is " + lion.getAge() + " years old.");
        lion.setAge(6);
        System.out.println(lion.getName() + "'s new age is " + lion.getAge());
        System.out.println(lion.getName() + " says " + lion.makeSound());

        System.out.println(elephant.getName() + " is " + elephant.getAge() + " years old.");
        elephant.setAge(11);
        System.out.println(elephant.getName() + "'s new age is " + elephant.getAge());
        System.out.println(elephant.getName() + " says " + elephant.makeSound());

        Penguin penguin = new Penguin(3, "Pingu");

        // Polymorphism: every item in the list implements IAnimal
        List<IAnimal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(penguin);

        System.out.println("\nZoo animals:");
        for (IAnimal animal : zoo) {
            System.out.println(animal.makeSound());
            System.out.println(animal.eatFood());
        }
    }
}
