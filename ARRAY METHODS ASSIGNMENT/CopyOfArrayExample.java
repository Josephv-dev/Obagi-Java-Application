//arrays copy off


import java.util.Arrays;

public class CopyOfArrayExample {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};

        // Copy the entire array
        int[] copiedArrayFull = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Full copy: " + Arrays.toString(copiedArrayFull));

        // Copy with a new length (shorter)
        int[] copiedArrayShort = Arrays.copyOf(originalArray, 3);
        System.out.println("Shorter copy (length 3): " + Arrays.toString(copiedArrayShort));

        // Copy with a new length (longer) - extra elements are filled with the default value (0 for int)
        int[] copiedArrayLonger = Arrays.copyOf(originalArray, 7);
        System.out.println("Longer copy (length 7): " + Arrays.toString(copiedArrayLonger));

        String[] originalStringArray = {"apple", "banana", "cherry"};

        // Copy the entire String array
        String[] copiedStringArrayFull = Arrays.copyOf(originalStringArray, originalStringArray.length);
        System.out.println("Full String copy: " + Arrays.toString(copiedStringArrayFull));

        // Copy a portion of the String array
        String[] copiedStringArrayPartial = Arrays.copyOf(originalStringArray, 2);
        System.out.println("Partial String copy (length 2): " + Arrays.toString(copiedStringArrayPartial));

        // Copy a String array with a longer length - extra elements are filled with null
        String[] copiedStringArrayLonger = Arrays.copyOf(originalStringArray, 5);
        System.out.println("Longer String copy (length 5): " + Arrays.toString(copiedStringArrayLonger));
    }
}