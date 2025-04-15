//Exercise 5.21


import java.util.Scanner;

public class SeparatingDigits {

    public static int integerQuotient(int a, int b) {
        return a / b; // Calculate integer quotient [cite: 39, 40, 41, 42]
    }

    public static int integerRemainder(int a, int b) {
        return a % b; // Calculate integer remainder [cite: 39, 40, 41, 42]
    }

    public static void displayDigits(int number) {
        if (number < 1 || number > 99999) {
            System.out.println("Number must be between 1 and 99999.");
            return;
        }

        int divisor = 10000;
        while (divisor > 0) {
            int digit = integerQuotient(number, divisor);
            System.out.print(digit + "  ");
            number = integerRemainder(number, divisor);
            divisor /= 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 99999: ");
        int number = scanner.nextInt();

        displayDigits(number); // Display digits [cite: 42, 43]

        scanner.close();
    }
}