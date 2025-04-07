import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        int number;
        int smallest;

        System.out.print("Enter the number of values: ");
        count = input.nextInt();

        System.out.print("Enter the first number: ");
        smallest = input.nextInt(); // Initialize smallest

        for (int i = 1; i < count; i++) {
            System.out.print("Enter the next number: ");
            number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest value is: " + smallest);
    }
}