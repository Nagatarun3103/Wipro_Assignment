package assignment;

class Vehicle {
    String color;
    int noOfWheels;
    String model;

    public Vehicle(String color, int noOfWheels, String model) {
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Wheels: " + noOfWheels);
    }
}