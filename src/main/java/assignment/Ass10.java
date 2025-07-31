package assignment;

import java.util.Scanner;

public class Ass10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter total number of eggs: ");
        int eggs = scan.nextInt();
        
        int gross = eggs / 144;
        int remainderAfterGross = eggs % 144;
        
        int dozen = remainderAfterGross / 12;
        int leftover = remainderAfterGross % 12;
        
        System.out.println("Your number of eggs is:");
        System.out.println(gross + " gross, " + dozen + " dozen, and " + leftover + " left over.");
        
        scan.close();
    }
}
