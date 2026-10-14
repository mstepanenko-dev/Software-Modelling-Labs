package org.roehampton.sd3.zoo.animals;

public class Penguin extends AnimalBase {

    public Penguin(int age, String name) {
        super(age, name);
    }

    @Override
    public String makeSound() {
        return "Honk!";
    }

    @Override
    public String eatFood() {
        return "The penguin eats fish.";
    }
}