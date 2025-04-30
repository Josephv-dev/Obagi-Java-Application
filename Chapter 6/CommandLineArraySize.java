/*
6.15 (Command-Line Arguments)

Rewrite Fig. 6.2 so that the size of the array is specified by the first command-line argument. 
If no command-line argument is provided, use 10 as the default size.    

Note: Since I don't have access to "Fig. 6.2", I'll create a simple program that demonstrates how to use command-line arguments to specify the size of an array.  
You can adapt this to your specific "Fig. 6.2" code.
*/

public class CommandLineArraySize {

    public static void main(String[] args) {
        int arraySize;

        if (args.length > 0) {
            try {
                arraySize = Integer.parseInt(args[0]); // Get size from command-line argument
            } catch (NumberFormatException e) {
                System.err.println("Invalid command-line argument. Using default size 10.");
                arraySize = 10;
            }
        } else {
            arraySize = 10; // Default size
        }

        int[] myArray = new int[arraySize];

        System.out.println("Array of size: " + arraySize);

        // Fill the array with some values (for demonstration)
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}
