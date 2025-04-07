public class Factorials {
    public static void main(String[] args) {
        System.out.println("Number\tFactorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(i + "\t" + factorial);
        }
    }
}
/*his program calculates the factorial for numbers 1 through 20.  
It uses nested loops: the outer loop iterates through the numbers, 
and the inner loop calculates the factorial. The results are displayed in a tabular format.    

Difficulty with Factorial of 100:

The factorial of 100 is an extremely large number that would exceed the maximum value 
that even a long data type can hold. This would lead to an overflow, resulting in an incorrect result*/