package edu.guilford;

import java.util.Random;

public class Dogs {
    // attributes
    private String name;
    private String breed;
    private int age;
    private double weight;

    private Random rand = new Random();

    // getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // constructors
    public Dogs(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // random constructor
    public Dogs(String name, String breed) {
        this.name = name;
        this.breed = breed;
        age = rand.nextInt(28);
        weight = rand.nextDouble(120);
    }

    // methods
    public void bark() {
        System.out.println("Woof!");
    }

    // toString method
    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age: " + age + " Weight: " + weight;
    }

    // helper method

    public void liklihoodOfDeath() {
        if (age > 10 && weight > 80) {
            System.out.println("Your dog is likely to die soon.");
        } else {
            System.out.println("Your dog is likely to live a long life.");
        }
    }

    // Analyze the dogs weight to determine if it is over or underweight
    public void weightAnalysis() {
        if (weight < 50) {
            System.out.println("Your dog is underweight.");
        } else if (weight > 100) {
            System.out.println("Your dog is overweight.");
        } else {
            System.out.println("Your dog is at a healthy weight.");
        }
    }

}
