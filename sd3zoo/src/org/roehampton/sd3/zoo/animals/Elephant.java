package org.roehampton.sd3.zoo.animals;

public class Elephant implements IAnimal {

    private int age;
    private String name;

    public Elephant(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Trumpet!";
    }

    @Override
    public String eatFood() {
        return "The elephant eats plants.";
    }
}
