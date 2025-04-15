//Exercise 5.32

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Calculate distance [cite: 77, 78, 79]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double dist = distance(x1, y1, x2, y2);
        System.out.println("The distance between the points is: " + dist);

        scanner.close();
    }
}