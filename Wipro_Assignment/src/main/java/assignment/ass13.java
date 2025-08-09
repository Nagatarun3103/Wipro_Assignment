package assignment;

import java.util.Scanner;

public class ass13 {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("Enter type of worker (1 for DailyWorker, 2 for SalariedWorker): ");
	        int type = scan.nextInt();
	        scan.nextLine(); // consume leftover newline

	        System.out.print("Enter worker name: ");
	        String name = scan.nextLine();

	        System.out.print("Enter salary rate per hour: ");
	        double salaryRate = scan.nextDouble();

	        System.out.print("Enter hours worked: ");
	        int hours = scan.nextInt();

	        Worker worker;

	        if (type == 1) {
	            worker = new DailyWorker(name, salaryRate);
	        } else {
	            worker = new SalariedWorker(name, salaryRate);
	        }

	        worker.displayPay(hours);
	    }
	}