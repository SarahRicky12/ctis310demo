package edu.guilford;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Fido", "Poodle", 3, 20.5);
        ArrayList<Dogs> dogList = new ArrayList<Dogs>();
        dogList.add(dog1);

        // Create a loop to instantiate 5 dogs and add them to the ArrayList

        for (int i = 0; i < 5; i++) {
            Dogs dog = new Dogs("Name", "Breed");
            dogList.add(dog);
        }

        // Create a loop to print out the name and breed of each dog in the ArrayList

        for (Dogs dog : dogList) {
            System.out.println(dog.getName() + " " + dog.getBreed() + " " + dog.getAge() + " " + dog.getWeight());
        }

        // Create a loop to analyze each dogs weight using weightAnalysis() method

        for (Dogs dog : dogList) {
            dog.weightAnalysis();
        }

    }

}
