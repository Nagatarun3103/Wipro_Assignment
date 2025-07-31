package assignment;

import java.util.Scanner;

public class Ass8 {
	private static final char Y = 0;

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Number of classes held ::");
		int classes=scan.nextInt();
		
		System.out.println("Number of classes attended ::");
		int attended=scan.nextInt();
		
		double percentage = ((double) attended / classes) * 100;
		

        System.out.println("Attendance Percentage: " + percentage + "%");
        
        System.out.println("Do you have a medical cause? (Y/N): ");
        char medical = scan.next().charAt(0);

		if (percentage >= 70) {
            System.out.println("Student is allowed to sit in the exam.");
        }
		else if(medical == 'y') 
        {
            System.out.println("Student is allowed to sit in the exam.");
        }
        else  {
            System.out.println("Student is NOT allowed to sit in the exam.");
        }

        scan.close();
    }
}

/*
Number of classes held ::
100
Number of classes attended ::
75
Attendance Percentage: 75.0%
Do you have a medical cause? (Y/N): 
y
Student is allowed to sit in the exam.
*/