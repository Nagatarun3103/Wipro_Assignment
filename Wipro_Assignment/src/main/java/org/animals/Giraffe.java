package org.animals;

public class Giraffe {
	String color = "Yellow";
    double weight = 190.5;
    int age = 10;

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "hums";
    }

    public void printInfo() {
        System.out.println("Giraffe [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
        System.out.println();
    }
}


