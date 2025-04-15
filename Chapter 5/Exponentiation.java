//Exercise 5.14

import java.util.Scanner;

public class Exponentiation {

    public static int integerPower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base; // Calculate base^exponent [cite: 19, 20, 21]
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent (positive nonzero integer): ");
        int exponent = scanner.nextInt();

        int result = integerPower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result); // Display result [cite: 22]

        scanner.close();
    }
}