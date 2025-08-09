package assignment;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class Ass29 {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input
            System.out.print("Enter Register Number: ");
            String regNo = scanner.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = scanner.nextLine();

            // Validate Register Number length
            if (regNo.length() != 9) {
                throw new IllegalArgumentException("Register number must be exactly 9 characters.");
            }

            // Validate Mobile Number length
            if (mobile.length() != 10) {
                throw new IllegalArgumentException("Mobile number must be exactly 10 digits.");
            }

            // Check if mobile contains only digits
            if (!mobile.matches("\\d+")) {
                throw new NumberFormatException("Mobile number must contain only digits.");
            }

            // Check if register number contains only letters and digits
            if (!regNo.matches("[a-zA-Z0-9]+")) {
                throw new NoSuchElementException("Register number must contain only letters and digits.");
            }

            // If all checks pass
            System.out.println("valid");

        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("invalid");
        }

        scanner.close();
    }
}

/*
 * Enter Register Number: wertyuiod
Enter Mobile Number: 1234567890
valid

 */
