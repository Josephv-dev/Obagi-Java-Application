import java.util.Arrays;

// arrays to string

public class ToStringArrayExample {
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {1, 2, 3, 4, 5};
        String numbersString = Arrays.toString(numbers);
        System.out.println("Integer array as string: " + numbersString);

        // Double array
        double[] decimals = {1.1, 2.2, 3.3};
        String decimalsString = Arrays.toString(decimals);
        System.out.println("Double array as string: " + decimalsString);

        // Boolean array
        boolean[] flags = {true, false, true};
        String flagsString = Arrays.toString(flags);
        System.out.println("Boolean array as string: " + flagsString);

        // String array
        String[] words = {"Hello", "World", "Java"};
        String wordsString = Arrays.toString(words);
        System.out.println("String array as string: " + wordsString);

        // Character array
        char[] letters = {'a', 'b', 'c'};
        String lettersString = Arrays.toString(letters);
        System.out.println("Character array as string: " + lettersString);

        // An empty array
        int[] emptyArray = {};
        String emptyArrayString = Arrays.toString(emptyArray);
        System.out.println("Empty array as string: " + emptyArrayString);

        // A null array - note that calling toString() on a null array will result in a NullPointerException
        int[] nullArray = null;
        // String nullArrayString = Arrays.toString(nullArray); // This line would throw a NullPointerException
        System.out.println("Null array (direct print): " + nullArray);
    }
}