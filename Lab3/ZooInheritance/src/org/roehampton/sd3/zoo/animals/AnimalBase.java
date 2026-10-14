package org.roehampton.sd3.zoo.animals;

public abstract class AnimalBase implements IAnimal {

    private int age;
    private String name;

    public AnimalBase(int age, String name) {
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
    public abstract String makeSound();

    @Override
    public abstract String eatFood();
}