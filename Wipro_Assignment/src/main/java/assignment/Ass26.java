package assignment;

import java.util.*;

public class Ass26 {
    public static void main(String[] args) {
        // Input array
        int[] input = {2, 3, 54, 1, 6, 7, 7};

        // Use Set to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<Integer>();
        for (int num : input) {
            uniqueNumbers.add(num);
        }

        // Calculate sum of even numbers
        int evenSum = 0;
        for (int num : uniqueNumbers) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        // Print result
        System.out.println("Sum of even numbers without duplicates: " + evenSum);
    }
}

/*
 * Sum of even numbers without duplicates: 62
*/