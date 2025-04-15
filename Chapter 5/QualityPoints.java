//Exercise 5.28

import java.util.Scanner;

public class QualityPoints {

    public static int qualityPoints(int average) {
        if (average >= 90) {
            return 4;
        } else if (average >= 80) {
            return 3;
        } else if (average >= 70) {
            return 2;
        } else if (average >= 60) {
            return 1;
        } else {
            return 0;
        } // Calculate quality points [cite: 63]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's average: ");
        int average = scanner.nextInt();

        int points = qualityPoints(average);
        System.out.println("Quality points: " + points); // Display quality points [cite: 63]

        scanner.close();
    }
}