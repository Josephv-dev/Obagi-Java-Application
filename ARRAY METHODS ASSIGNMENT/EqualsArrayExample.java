// arrays equal()


import java.util.Arrays;

public class EqualsArrayExample {
    public static void main(String[] args) {
        // Declare and initialize two integer arrays that are equal
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Declare and initialize another integer array that is not equal
        int[] array3 = {1, 2, 4, 4, 5};

        // Declare and initialize an array with a different length
        int[] array4 = {1, 2, 3};

        // Compare array1 and array2
        boolean areEqual1and2 = Arrays.equals(array1, array2);
        System.out.println("Are array1 and array2 equal? " + areEqual1and2);

        // Compare array1 and array3
        boolean areEqual1and3 = Arrays.equals(array1, array3);
        System.out.println("Are array1 and array3 equal? " + areEqual1and3);

        // Compare array1 and array4 (different length)
        boolean areEqual1and4 = Arrays.equals(array1, array4);
        System.out.println("Are array1 and array4 equal? " + areEqual1and4);

        // Compare array1 with itself
        boolean areEqual1and1 = Arrays.equals(array1, array1);
        System.out.println("Is array1 equal to itself? " + areEqual1and1);

        // Comparing arrays of different types will result in a compile-time error
        // For example:
        // String[] stringArray = {"a", "b", "c"};
        // boolean areEqualDifferentTypes = Arrays.equals(array1, stringArray); // This will not compile
    }
}