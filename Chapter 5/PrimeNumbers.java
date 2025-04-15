//Exercise 5.25

public class PrimeNumbers {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) { // Check for prime number [cite: 52, 53, 54, 55, 56, 57]
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i); // Display prime number [cite: 55]
            }
        }
    }
}