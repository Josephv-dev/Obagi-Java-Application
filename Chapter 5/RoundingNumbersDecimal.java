//Exercise 5.10

import java.util.Scanner;

public class RoundingNumbersDecimal {

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10.0; // Round to tenths [cite: 15, 16, 17, 18]
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100.0; // Round to hundredths [cite: 15, 16, 17, 18]
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000.0; // Round to thousandths [cite: 18]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double number = scanner.nextDouble();

        System.out.println("Original value: " + number);
        System.out.println("Rounded to integer: " + roundToInteger(number));
        System.out.println("Rounded to tenths: " + roundToTenths(number));
        System.out.println("Rounded to hundredths: " + roundToHundredths(number));
        System.out.println("Rounded to thousandths: " + roundToThousandths(number)); // Display rounded values [cite: 18]

        scanner.close();
    }
}