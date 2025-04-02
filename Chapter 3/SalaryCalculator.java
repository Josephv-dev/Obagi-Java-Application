// Chapter 3.20 - Exercise 2 (Salary Calculator  )//

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter information for employee " + i + ":");
            System.out.print("Enter number of hours worked: ");
            double hoursWorked = scanner.nextDouble();

            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();

            double grossPay;
            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
            }

            System.out.printf("Employee %d's gross pay: $%.2f\n", i, grossPay);
        }
        scanner.close();
    }
}