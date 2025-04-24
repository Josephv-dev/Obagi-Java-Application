// ARRAYS SORT()

import java.util.Arrays;

public class SortArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an unsorted integer array
        int[] numbers = {5, 2, 8, 1, 9, 4};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}