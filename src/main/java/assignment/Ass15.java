package assignment;

import java.util.Scanner;
import java.util.HashMap;

public class Ass15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 elements into array
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        // HashMap to store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the number of occurrences
        System.out.println("\nOccurrences of each element:");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " occurs " + frequencyMap.get(key) + " time(s)");
        }

        scanner.close();
    }
}

