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
        return "I am " + getKind() + ", eat " + getFoodKind() + " " +calculateFoodWeight();
    }
}

