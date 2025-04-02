import java.util.Scanner;
import java.util.Random;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int number;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == randomNumber) {
                System.out.printf("Your Guess is correct %d%n", randomNumber);
            } else if (number < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        } while (number != randomNumber);

        input.close();
    }
}