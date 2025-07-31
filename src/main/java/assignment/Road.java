package assignment;

public class Road {
	
	    public static void main(String[] args) {
	        Truck truck = new Truck("Red", 6, "Volvo", 15);
	        Bus bus = new Bus("Blue", 4, "Tata", 50);
	        Car car = new Car("Black", 4, "Hyundai i20", true);

	        System.out.println("--- Truck Details ---");
	        truck.showTruckDetails();

	        System.out.println("\n--- Bus Details ---");
	        bus.showBusDetails();

	        System.out.println("\n--- Car Details ---");
	        car.showCarDetails();

}
}