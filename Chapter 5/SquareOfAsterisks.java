//Exercise 5.18

import java.util.Scanner;

public class SquareOfAsterisks {

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*"); // Print asterisk [cite: 33, 34]
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        squareOfAsterisks(side);

        scanner.close();
    }
}