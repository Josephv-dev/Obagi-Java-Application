//Exercise 5.19


import java.util.Scanner;

public class SquareOfAnyCharacter {

    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter); // Print fill character [cite: 35, 36, 37]
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        System.out.print("Enter the fill character: ");
        char fill = scanner.next().charAt(0); // Read character from user [cite: 37]

        squareOfAnyCharacter(side, fill);

        scanner.close();
    }
}