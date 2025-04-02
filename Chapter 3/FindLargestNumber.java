// Chapter 3.21 - Exercise 2 (FindLargestNumber)//
/* Initialize counter to 1
Initialize largest to the first number
While counter is less than or equal to 10
    Input number
    If number is greater than largest
        largest = number
    Increment counter
Print largest */

import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer

        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}