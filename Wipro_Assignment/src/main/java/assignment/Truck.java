package assignment;

class Truck extends Vehicle {
    int loadCapacity;

    public Truck(String color, int noOfWheels, String model, int loadCapacity) {
        super(color, noOfWheels, model);
        this.loadCapacity = loadCapacity;
    }

    public void showTruckDetails() {
        displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}