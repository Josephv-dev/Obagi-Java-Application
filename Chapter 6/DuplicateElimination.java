/* 6.12 (Duplicate Elimination)
Write a program that takes five numbers (between 10 and 100 inclusive) as input and displays each number only if it's not a duplicate of a previously entered number.  
Handle the "worst case" where all five numbers are different. Use the smallest possible array.
*/

import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5]; // Smallest possible array to store 5 numbers
        int count = 0; // Keep track of the number of unique numbers entered

        System.out.println("Enter five numbers between 10 and 100 (inclusive):");

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = input.nextInt();

            if (num >= 10 && num <= 100) {
                if (!isDuplicate(numbers, num, count)) {
                    numbers[count] = num;
                    count++;
                    System.out.print("Unique values entered: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Duplicate number. Enter a different number.");
                }
            } else {
                System.out.println("Invalid number. Must be between 10 and 100.");
            }
        }

        System.out.print("\nComplete set of unique values: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Helper function to check for duplicates
    public static boolean isDuplicate(int[] arr, int num, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}