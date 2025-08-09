package assignment;

import java.util.Scanner;

public class Bikerace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] speeds = new double[5];
        double sum = 0;

        // Input speeds
        System.out.println("Enter the speed of 5 bikers:");
        for (int i = 0; i < 5; i++) {
            speeds[i] = scanner.nextDouble();
            sum += speeds[i];
        }

        // Calculate average speed
        double average = sum / 5;
        System.out.println("Average Speed: " + average);

        // Print qualifying racers
        System.out.println("Qualifying racers (speed > average):");
        for (double speed : speeds) {
            if (speed > average) {
                System.out.println(speed);
            }
        }

        scanner.close();
    }
}


/*
Enter the speed of 5 bikers:

40
50
70
80
90
Average Speed: 66.0
Qualifying racers (speed > average):
70.0
80.0
90.0
*/