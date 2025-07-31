package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Demonstrate InputMismatchException
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); // May throw InputMismatchException
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter a valid integer.");
            scanner.nextLine(); // Clear invalid input from buffer
        }

        // Part 2: Demonstrate StringIndexOutOfBoundsException
        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            System.out.print("Enter index to access character at: ");
            int index = scanner.nextInt();

            char ch = input.charAt(index); // May throw StringIndexOutOfBoundsException
            System.out.println("Character at index " + index + " is: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of range for the string.");
        }

        scanner.close();
    }
}
