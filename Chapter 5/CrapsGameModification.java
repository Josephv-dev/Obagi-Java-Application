//Exercise 5.33


import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGameModification {

    enum Status {
        CONTINUE,
        WON,
        LOST
    }

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bankBalance = 1000; // Initial bank balance [cite: 80, 81, 82, 83, 84, 85, 86, 87]
        int myPoint = 0;
        Status gameStatus;

        while (true) {
            System.out.printf("Current bank balance: $%d%n", bankBalance);
            int wager;
            do {
                System.out.print("Enter your wager: $");
                wager = scanner.nextInt();
                if (wager > bankBalance) {
                    System.out.println("Wager cannot exceed bank balance. Please re-enter.");
                }
            } while (wager > bankBalance);

            int sumOfDice = rollDice();

            switch (sumOfDice) {
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == 7) {
                    gameStatus = Status.LOST;
                }
            }

            if (gameStatus == Status.WON) {
                System.out.println("Player wins");
                bankBalance += wager;
                System.out.printf("New bank balance: $%d%n", bankBalance);
            } else {
                System.out.println("Player loses");
                bankBalance -= wager;
                System.out.printf("New bank balance: $%d%n", bankBalance);
                if (bankBalance <= 0) {
                    System.out.println("Sorry. You busted!");
                    break;
                }
            }
            System.out.print("Play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
        scanner.close();
    }
}