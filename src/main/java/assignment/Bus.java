package assignment;

class Bus extends Vehicle {
    int seatingCapacity;

    public Bus(String color, int noOfWheels, String model, int seatingCapacity) {
        super(color, noOfWheels, model);
        this.seatingCapacity = seatingCapacity;
    }

    public void showBusDetails() {
        displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity + " people");
    }
}