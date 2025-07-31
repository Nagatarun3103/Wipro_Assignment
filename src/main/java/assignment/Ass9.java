package assignment;

import java.util.Scanner;

public class Ass9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double totalSales = 0.0;

	        while (true) {
	            System.out.print("Enter product number (1-3), or 0 to exit: ");
	            int productNumber = scanner.nextInt();

	            if (productNumber == 0) {
	                break; // exit loop
	            }

	            System.out.print("Enter quantity sold: ");
	            int quantity = scanner.nextInt();

	            double price = 0.0;

	            // Use switch to set price based on product number
	            switch (productNumber) {
	                case 1:
	                    price = 22.50;
	                    break;
	                case 2:
	                    price = 44.50;
	                    break;
	                case 3:
	                    price = 9.98;
	                    break;
	                default:
	                    System.out.println("Invalid product number!");
	                    continue; // skip the rest of the loop
	            }

	            double productTotal = price * quantity;
	            totalSales += productTotal;

	            System.out.printf("Product %d: %d units × ₹%.2f = ₹%.2f%n",
	                              productNumber, quantity, price, productTotal);
	        }

	        System.out.printf("Total retail value of all products sold: ₹%.2f%n", totalSales);
	        scanner.close();
	    }
	}
