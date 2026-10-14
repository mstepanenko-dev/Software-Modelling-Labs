package org.roehampton.sd3.zoo.animals;

public class Elephant extends AnimalBase {

    public Elephant(int age, String name) {
        super(age, name);
    }

    @Override
    public String makeSound() {
        return "Trumpet!";
    }

    @Override
    public String eatFood() {
        return "The elephant eats grass.";
    }
}