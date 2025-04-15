//Exercise 5.8
import java.util.Scanner;

public class ParkingCharges {

    public static double calculateCharges(double hours) {
        double charge = 2.0; // Minimum fee [cite: 4]

        if (hours > 3.0) {
            charge += (Math.ceil(hours) - 3) * 0.5; // Additional charge [cite: 5]
        }

        return Math.min(charge, 10.0); // Maximum charge is $10.00 [cite: 6]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;

        while (true) {
            System.out.print("Enter hours parked for a customer (or 0 to finish): ");
            double hours = scanner.nextDouble();

            if (hours == 0) {
                break; // Exit loop if input is 0
            }

            double charge = calculateCharges(hours);
            System.out.printf("Charge for this customer: $%.2f%n", charge);
            totalReceipts += charge;
        }

        System.out.printf("Total of yesterday's receipts: $%.2f%n", totalReceipts); // Display total receipts [cite: 9]
        scanner.close();
    }
}