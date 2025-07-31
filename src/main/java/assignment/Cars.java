package assignment;

class Car extends Vehicle {
    boolean isAutomatic;

    public Car(String color, int noOfWheels, String model, boolean isAutomatic) {
        super(color, noOfWheels, model);
        this.isAutomatic = isAutomatic;
    }

    public void showCarDetails() {
        displayInfo();
        System.out.println("Transmission: " + (isAutomatic ? "Automatic" : "Manual"));
    }
}