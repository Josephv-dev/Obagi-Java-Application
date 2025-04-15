//Exercise 5.17

import java.util.Scanner;

public class EvenOrOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0; // Check if the number is even [cite: 30, 31, 32]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or 0 to finish): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Exit loop if input is 0
            }

            if (isEven(number)) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }

        scanner.close();
    }
}