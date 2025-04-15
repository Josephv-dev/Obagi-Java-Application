//Exercise 5.30

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int number = random.nextInt(1000) + 1; // Generate random number [cite: 68]
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1 and 1000."); // Prompt user [cite: 68]

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Too low. Try again."); // Too low [cite: 69, 70]
            } else if (guess > number) {
                System.out.println("Too high. Try again."); // Too high [cite: 69, 70]
            } else {
                System.out.println("Congratulations. You guessed the number!"); // Correct guess [cite: 71]
            }
        } while (guess != number);

        scanner.close();
    }
}