// Chapter 3.22 - Exercise 2 ( Validate Input )//


import java.util.Scanner;

public class ValidateInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print("Enter 1 or 2: ");
            input = scanner.nextInt();
            if (input == 1 || input == 2) {
                break; // Exit the loop if input is valid
            }
            System.out.println("Invalid input. Please enter 1 or 2.");
        }

        System.out.println("You entered: " + input);
        scanner.close();
    }
}