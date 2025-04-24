// arrays binarySearch

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        // Declare and initialize a sorted integer array
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // The element to search for
        int key = 23;

        // Perform binary search
        int index = Arrays.binarySearch(numbers, key);

        // Check the result
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array.");
            System.out.println("Insertion point (where it would be if present): " + (-index - 1));
        }

        // Example of searching for an element that is not present
        int notFoundKey = 30;
        int notFoundIndex = Arrays.binarySearch(numbers, notFoundKey);

        if (notFoundIndex >= 0) {
            System.out.println("Element " + notFoundKey + " found at index: " + notFoundIndex);
        } else {
            System.out.println("Element " + notFoundKey + " not found in the array.");
            System.out.println("Insertion point (where it would be if present): " + (-notFoundIndex - 1));
        }
    }
}