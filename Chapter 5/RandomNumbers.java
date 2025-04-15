//Exercise 5.13

import java.security.SecureRandom;

public class RandomNumbers {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // a) 2, 4, 6, 8, 10
        int a = random.nextInt(5) * 2 + 2;
        System.out.println("a) Random number from {2, 4, 6, 8, 10}: " + a); // Display random number [cite: 19]

        // b) 3, 5, 7, 9, 11
        int b = random.nextInt(5) * 2 + 3;
        System.out.println("b) Random number from {3, 5, 7, 9, 11}: " + b); // Display random number [cite: 19]

        // c) 6, 10, 14, 18, 22
        int c = random.nextInt(5) * 4 + 6;
        System.out.println("c) Random number from {6, 10, 14, 18, 22}: " + c); // Display random number [cite: 19]
    }
}