//arrays compare


import java.util.Arrays;

public class CompareArrayExample {
    public static void main(String[] args) {
        // Declare and initialize some integer arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 4, 4, 5};
        int[] array4 = {1, 2, 3};
        int[] array5 = {1, 2, 3, 4};
        int[] array6 = {1, 2, 3, 5};

        // Compare array1 and array2 (equal)
        int comparison1and2 = Arrays.compare(array1, array2);
        System.out.println("Comparison of array1 and array2: " + comparison1and2);

        // Compare array1 and array3 (different at index 2: 3 vs 4)
        int comparison1and3 = Arrays.compare(array1, array3);
        System.out.println("Comparison of array1 and array3: " + comparison1and3);

        // Compare array1 and array4 (array4 is shorter)
        int comparison1and4 = Arrays.compare(array1, array4);
        System.out.println("Comparison of array1 and array4: " + comparison1and4);

        // Compare array4 and array5 (array4 is shorter)
        int comparison4and5 = Arrays.compare(array4, array5);
        System.out.println("Comparison of array4 and array5: " + comparison4and5);

        // Compare array1 and array5 (array5 is shorter)
        int comparison1and5 = Arrays.compare(array1, array5);
        System.out.println("Comparison of array1 and array5: " + comparison1and5);

        // Compare array1 and array6 (different at index 3: 4 vs 5)
        int comparison1and6 = Arrays.compare(array1, array6);
        System.out.println("Comparison of array1 and array6: " + comparison1and6);
    }
}