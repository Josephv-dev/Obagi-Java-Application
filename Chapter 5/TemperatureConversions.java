//Exercise 5.22

import java.util.Scanner;

public class TemperatureConversions {

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32); // Celsius equivalent [cite: 43, 44, 45]
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32; // Fahrenheit equivalent [cite: 43, 44, 45]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion direction:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = celsius(fahrenheit);
            System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = fahrenheit(celsius);
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}