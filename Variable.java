import java.util.Scanner; // Import Scanner for user input

public class Variable {
    public static void main(String[] args) {
        // a) Declare variables c, thisIsAVariable, q76354, and number as type int
        int c, thisIsAVariable, q76354, number;

        // b) Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // c) Input an integer and assign the result to int variable value
        Scanner input = new Scanner(System.in); // Create a Scanner object
        int value = input.nextInt(); // Read user input

        // d) Print "This is a Java program" on one line
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines using printf
        System.out.printf("This is a Java%nprogram%n");

        // f) If the variable number is not equal to 7, display the message
        number = 10; // Example assignment (you can change this)
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        input.close(); // Close the scanner
    }
}