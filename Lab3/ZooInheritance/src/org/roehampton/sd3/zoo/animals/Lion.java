package org.roehampton.sd3.zoo.animals;

public class Lion extends AnimalBase {

    public Lion(int age, String name) {
        super(age, name);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }

    @Override
    public String eatFood() {
        return "The lion eats meat.";
    }
}