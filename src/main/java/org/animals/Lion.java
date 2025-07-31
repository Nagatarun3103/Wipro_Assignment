package org.animals;

public class Lion {
    String color = "Golden";
    double weight = 190.5;
    int age = 10;

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String sound() {
        return "Roar";
    }

    public void printInf() {
        System.out.println("Lion [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + "]");
        System.out.println("Vegetarian: " + isVegetarian());
        System.out.println("Can Climb: " + canClimb());
        System.out.println("Sound: " + sound());
        System.out.println();
    }

	
}
