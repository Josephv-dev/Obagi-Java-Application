/*
(Variable-Length Argument List)
Write a method product that calculates the product of a series of integers passed to it using a variable-length argument list.
Test the method with different numbers of arguments. 
*/

public class VariableLengthArgs {

    public static void main(String[] args) {
        System.out.println("Product of 2, 3: " + product(2, 3));
        System.out.println("Product of 5, 10, 2: " + product(5, 10, 2));
        System.out.println("Product of 1, 2, 3, 4, 5: " + product(1, 2, 3, 4, 5));
        System.out.println("Product of an empty list: " + product()); // Test with no arguments
    }

    public static int product(int... numbers) {
        int result = 1;
        if (numbers.length == 0) {
            return 0; // Or throw an exception, depending on desired behavior for empty input
        }
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}