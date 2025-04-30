/* 6.11 One-Dimensional Array Operations
Perform the following array operations:

Set all elements of an integer array counts to zero.    
Add one to each element of an integer array bonus.    
Display the values of an integer array bestScores in column format
*/

public class ArrayOperations {

    public static void main(String[] args) {
        // a) Set elements of 'counts' to zero
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        System.out.println("Array 'counts' after setting to zero:");
        printArray(counts);

        // b) Add one to each element of 'bonus'
        int[] bonus = new int[15];
        // Initialize bonus array with some values for demonstration
        for (int i = 0; i < bonus.length; i++) {
            bonus[i] = i * 5; 
        }
        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }
        System.out.println("\nArray 'bonus' after adding one to each element:");
        printArray(bonus);

        // c) Display 'bestScores' in column format
        int[] bestScores = {95, 88, 92, 76, 100};
        System.out.println("\nArray 'bestScores' in column format:");
        for (int score : bestScores) {
            System.out.println(score);
        }
    }

    // Helper method to print array elements
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}