//Exercise 5.20


import java.util.Scanner;

public class CircleArea {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius; // Calculate area [cite: 38]
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = circleArea(radius);
        System.out.printf("The area of the circle is: %.2f%n", area);

        scanner.close();
    }
}