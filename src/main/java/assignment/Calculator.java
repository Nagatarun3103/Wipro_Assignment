package assignment;

import java.util.Scanner;

public class Calculator {

    // Method to add two numbers
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    // Method to find difference
    public void diff(int a, int b) {
        int result = a - b;
        System.out.println("Difference: " + result);
    }

    // Method to multiply
    public void mul(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    // Method to divide
    public void div(int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Main method to test the Calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("input 1::");
        int num1 =scan.nextInt();
        System.out.println("input 2::");
        int num2 = scan.nextInt();

        calc.add(num1, num2);
        calc.diff(num1, num2);
        calc.mul(num1, num2);
        calc.div(num1, num2);
    }
}


/*

input 1::
12
input 2::
13
Addition: 25
Difference: -1
Multiplication: 156
Division: 0.9230769230769231

 */
 
