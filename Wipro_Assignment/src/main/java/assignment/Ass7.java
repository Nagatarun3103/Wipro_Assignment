package assignment;

import java.util.Scanner;

public class Ass7 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Number of classes held ::");
		int classes=scan.nextInt();
		
		System.out.println("Number of classes attended ::");
		int attended=scan.nextInt();
		
		double percentage = ((double) attended / classes) * 100;

        System.out.println("Attendance Percentage: " + percentage + "%");

        if (percentage >= 70) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit in the exam.");
        }

        scan.close();
    }
}

/*
Number of classes held ::
60
Number of classes attended ::
30
Attendance Percentage: 50.0%
Student is NOT allowed to sit in the exam.
*/