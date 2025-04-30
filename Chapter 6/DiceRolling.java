// 6.17 Dice Rolling


import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {
        Random random = new Random();
        int[] sums = new int[13]; // Array to store the counts of each sum (index 0 is not used)
        
        for (int i = 0; i < 36000000; i++) {
            int die1 = random.nextInt(6) + 1; // Roll the first die (1-6)
            int die2 = random.nextInt(6) + 1; // Roll the second die (1-6)
            int sum = die1 + die2;             // Calculate the sum
            sums[sum]++;                     // Increment the count for that sum
        }
        
        // Display the results in tabular format
        System.out.println("Sum\tFrequency");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + sums[i]);
        }
    }
}