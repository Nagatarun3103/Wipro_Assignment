package assignment;

import java.util.Scanner;

public class Ass5 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the salary:");
		double salary = scan.nextDouble();
		
		System.out.println("enter the service:");
		int service = scan.nextInt();
		
		if (service > 6)
		{
		   double i=salary/10;
		   System.out.println(i);
		}
		
		
	}

}
