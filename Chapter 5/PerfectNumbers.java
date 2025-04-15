//Exercise 5.24

public class PerfectNumbers {

    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }

        int sum = 1;
        System.out.print("Factors of " + number + ": 1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(" + " + i);
                sum += i;
            }
        }
        System.out.println();
        return sum == number; // Check for perfect number [cite: 48, 49, 50]
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.println(i + " is a perfect number."); // Display perfect number [cite: 50]
            }
        }
    }
}