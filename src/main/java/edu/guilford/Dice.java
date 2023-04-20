package edu.guilford;

public class Dice {

    //attributes 
    private int sides;
    private int value;

    //constructor
    public Dice(int sides) {
        this.sides = sides;
        this.value = 0;
    }

    //methods
    public int roll() {
        this.value = (int) (Math.random() * this.sides) + 1;
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public int getNumSides() {
        return this.sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String toString() {
        return "Dice [sides=" + sides + ", value=" + value + "]";
    }




    
}
