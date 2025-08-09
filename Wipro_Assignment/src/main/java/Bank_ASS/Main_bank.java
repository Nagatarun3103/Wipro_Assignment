package Bank_ASS;

import java.util.Scanner;

public class Main_bank {
    public static void main(String[] args) {
        Bank[] customers = new Bank[5];

        // Sample customers
        customers[0] = new Saving("12222", "Tarun", 2, "Engineer", 5000, 0.03);
        customers[1] = new Current("23333", "akash", 1, "Manager", 7000, 0.02, true);
        customers[2] = new Saving("34444", "rumu", 2, "Doctor", 9000, 0.025);
        customers[3] = new Current("45555", "siva", 1, "Teacher", 6000, 0.015, false);
        customers[4] = new Current("56666", "vardhan", 2, "Nurse", 8000, 0.02, true);

        Scanner sc = new Scanner(System.in);

        // Part (b): Search by account number
        System.out.print("Enter account number to search: ");
        String searchAcc = sc.nextLine();
        boolean found = false;
        for (Bank b : customers) {
            if (b.accNo.equalsIgnoreCase(searchAcc)) {
                System.out.println("\nCustomer Details:\n" + b.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No customer found with account number: " + searchAcc);
        }

        // Part (c): Count current account customers and total balance
        int currentCount = 0;
        double totalBalance = 0;
        for (Bank b : customers) {
            if (b instanceof Current) {
                currentCount++;
                totalBalance += b.calcBalance();
            }
        }

        System.out.println("\nTotal Current Account Customers: " + currentCount);
        System.out.println("Total Balance in Current Accounts: RM" + totalBalance);
    }
}

/*
 Enter account number to search: 23333

Customer Details:
Account No: 23333
Name: akash
Gender: Male
Job: Manager
Current Balance: RM7000.0
Account Type: Current
Fixed Deposit: Yes
Calculated Balance: RM6990.0

Total Current Account Customers: 3
Total Balance in Current Accounts: RM21090.0
*/
