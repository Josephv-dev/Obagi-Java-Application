// Chapter 3.19 - Exercise 2 (Sales Commission Calculator)//

import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSales = 0;

        System.out.println("Enter the items sold by the salesperson. Enter 0 to finish.");

        while (true) {
            System.out.print("Enter item number: ");
            int itemNumber = scanner.nextInt();
            if (itemNumber == 0) {
                break;
            }

            double itemValue = 0;
            switch (itemNumber) {
                case 1:
                    itemValue = 239.99;
                    break;
                case 2:
                    itemValue = 129.75;
                    break;
                case 3:
                    itemValue = 99.95;
                    break;
                case 4:
                    itemValue = 350.89;
                    break;
                default:
                    System.out.println("Invalid item number. Please try again.");
                    continue; // Go to the next iteration
            }
            totalSales += itemValue;
        }

        double earnings = 200 + (0.09 * totalSales);
        System.out.printf("Salesperson's earnings for the week: $%.2f\n", earnings);
        scanner.close();
    }
}