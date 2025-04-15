//Exercise 5.26

import java.util.Scanner;

public class ReversingDigits {

    public static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed; // Reverse digits [cite: 58, 59]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber); // Display reversed number [cite: 59]

        scanner.close();
    }
}