package assignment;
import java.util.Scanner;

public class Ass16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark;
        int total = 0;
        int students = 3;

        for (int i = 1; i <= students; i++) {
            while (true) {
                System.out.print("Enter the mark (0-100) for student " + i + ": ");
                if (scanner.hasNextInt()) {
                    mark = scanner.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        total += mark;
                        break;
                    } else {
                        System.out.println("Invalid input, try again...");
                    }
                } else {
                    System.out.println("Invalid input, try again...");
                    scanner.next(); 
                }
            }
        }

        double average = total / (double) students;
        System.out.printf("The average is: %.2f\n", average);

        scanner.close();
    }
}
