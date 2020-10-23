package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;

    Animal(double weight) {
        this.weight = weight;
    }

    public AnimalKind getKind() {

        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    public String toString() {

        return "I am " + getKind() + ", eat " + getFoodKind();
    }

    public double getWeight() {
        return weight;
    }

    public double getFoodCoeff() {
        return 0.02;
    }

    public double calculateFoodWeight() {
        return getFoodCoeff() * getWeight();
    }

    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + calculateFoodWeight();
    }
}

class Cow extends Animal {

    Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {
        return 0.05;
    }
}

class Humster extends Animal {

    Humster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.03;
    }
}

class Duck extends Animal {

    Duck(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.DUCK;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.CORN;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }
}