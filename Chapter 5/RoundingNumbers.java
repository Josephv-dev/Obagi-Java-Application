//Exercise 5.9

import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a double value (or 0 to finish): ");
            double x = scanner.nextDouble();

            if (x == 0) {
                break; // Exit loop if input is 0
            }

            double y = Math.floor(x + 0.5); // Round to nearest integer [cite: 11, 12]
            System.out.printf("Original number: %.2f, Rounded number: %.0f%n", x, y); // Display original and rounded number [cite: 14]
        }

        scanner.close();
    }
}