//array fillings

import java.util.Arrays;

public class FillArrayExample {
    public static void main(String[] args) {
        // Fill an entire integer array with a specific value
        int[] numbers1 = new int[5];
        int valueToFill = 10;
        Arrays.fill(numbers1, valueToFill);
        System.out.println("Array numbers1 after filling with " + valueToFill + ": " + Arrays.toString(numbers1));

        // Fill a specific range of an integer array
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int fillValueRange = 99;
        Arrays.fill(numbers2, 2, 7, fillValueRange); // Fill from index 2 (inclusive) to 7 (exclusive)
        System.out.println("Array numbers2 after filling range [2, 7) with " + fillValueRange + ": " + Arrays.toString(numbers2));

        // Fill an entire String array
        String[] words = new String[3];
        String wordToFill = "Hello";
        Arrays.fill(words, wordToFill);
        System.out.println("Array words after filling with \"" + wordToFill + "\": " + Arrays.toString(words));

        // Fill a specific range of a String array
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        String fillNameRange = "Guest";
        Arrays.fill(names, 1, 4, fillNameRange); // Fill from index 1 (inclusive) to 4 (exclusive)
        System.out.println("Array names after filling range [1, 4) with \"" + fillNameRange + "\": " + Arrays.toString(names));
    }
}