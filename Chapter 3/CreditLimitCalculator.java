// Chapter 3.18 - Exercise 2 (Credit Limit Calculator)//

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (or -1 to end): ");
            int accountNumber = scanner.nextInt();
            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = scanner.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = scanner.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = scanner.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.println("New balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("Credit limit not exceeded");
            }
        }
        System.out.println("Credit limit check completed.");
        scanner.close();
    }
}