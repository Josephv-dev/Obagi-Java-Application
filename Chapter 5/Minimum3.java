//Exercise 5.23

import java.util.Scanner;

public class Minimum3 {

    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c)); // Find minimum [cite: 46, 47]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double min = minimum3(num1, num2, num3);
        System.out.println("The smallest number is: " + min); // Display minimum [cite: 47]

        scanner.close();
    }
}