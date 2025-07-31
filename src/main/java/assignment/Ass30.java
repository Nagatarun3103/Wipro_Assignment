package assignment;

import java.util.Scanner;

//Functional interface
@FunctionalInterface
interface MinOfThree {
 float minimum3(float a, float b, float c);
}

public class Ass30 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Read 3 float values
     System.out.print("Enter first number: ");
     float num1 = scanner.nextFloat();

     System.out.print("Enter second number: ");
     float num2 = scanner.nextFloat();

     System.out.print("Enter third number: ");
     float num3 = scanner.nextFloat();

     // Implementing the method using method reference with lambda and Math.min
     MinOfThree min = (a, b, c) -> Math.min(a, Math.min(b, c));

     // Get result
     float result = min.minimum3(num1, num2, num3);

     // Display result
     System.out.println("The smallest value is: " + result);

     scanner.close();
 }
}
/*
Enter first number: 30.7
Enter second number: 38.9
Enter third number: 28.0
The smallest value is: 28.0
*/