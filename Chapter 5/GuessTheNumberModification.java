//Exercise 5.31


import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberModification {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int number = random.nextInt(1000) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int guessCount = 0;

        System.out.println("Guess a number between 1 and 1000.");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guessCount++; // Count guesses [cite: 72, 73, 74, 75, 76]

            if (guess < number) {
                System.out.println("Too low. Try again.");
            } else if (guess > number) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations. You guessed the number!");
                if (guessCount <= 10) {
                    System.out.println("Either you know the secret or you got lucky!"); // 10 or fewer guesses [cite: 73]
                } else {
                    System.out.println("You should be able to do better!"); // More than 10 guesses [cite: 75]
                }
            }
        } while (guess != number);

        scanner.close();
    }
}