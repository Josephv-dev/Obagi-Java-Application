//Exercise 5.29


import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {

    enum Coin {
        HEADS,
        TAILS
    }

    public static Coin flip() {
        SecureRandom random = new SecureRandom();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS; // Simulate coin flip [cite: 64, 65, 66, 67, 68]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("Toss Coin Menu:");
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 2) {
                break;
            } else if (choice == 1) {
                Coin result = flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                    System.out.println("The coin landed on HEADS.");
                } else {
                    tailsCount++;
                    System.out.println("The coin landed on TAILS.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Number of times HEADS appeared: " + headsCount); // Display results [cite: 66]
        System.out.println("Number of times TAILS appeared: " + tailsCount); // Display results [cite: 66]

        scanner.close();
    }
}