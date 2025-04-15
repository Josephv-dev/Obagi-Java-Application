//Exercise 5.16


import java.util.Scanner;

public class Multiples {

    public static boolean isMultiple(int first, int second) {
        return second % first == 0; // Check if second is a multiple of first [cite: 27, 28, 29]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first integer (or 0 to finish): ");
            int first = scanner.nextInt();

            if (first == 0) {
                break; // Exit loop if input is 0
            }

            System.out.print("Enter the second integer: ");
            int second = scanner.nextInt();

            if (isMultiple(first, second)) {
                System.out.println(second + " is a multiple of " + first);
            } else {
                System.out.println(second + " is not a multiple of " + first);
            }
        }

        scanner.close();
    }
}