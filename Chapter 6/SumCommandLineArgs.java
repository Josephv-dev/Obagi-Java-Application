/* 
6.16 (Using the Enhanced for Statement)
Write a program that uses an enhanced for statement to sum the double values passed by the command-line arguments.  
Use Double.parseDouble() to convert the string arguments to double values
*/

public class SumCommandLineArgs {

    public static void main(String[] args) {
        double sum = 0.0;

        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg);
                sum += value;
            } catch (NumberFormatException e) {
                System.err.println("Invalid argument: " + arg + ".  It will be ignored.");
            }
        }

        System.out.println("Sum of the valid double values: " + sum);
    }
}