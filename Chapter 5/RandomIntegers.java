//Exercise 5.12

import java.security.SecureRandom;

public class RandomIntegers {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // a) 1 ≤ n ≤ 2
        int n1 = random.nextInt(2) + 1;
        System.out.println("a) Random integer between 1 and 2: " + n1); // Display random integer [cite: 19]

        // b) 1 ≤ n ≤ 100
        int n2 = random.nextInt(100) + 1;
        System.out.println("b) Random integer between 1 and 100: " + n2); // Display random integer [cite: 19]

        // c) 0 ≤ n ≤ 9
        int n3 = random.nextInt(10);
        System.out.println("c) Random integer between 0 and 9: " + n3); // Display random integer [cite: 19]

        // d) 1000 ≤ n ≤ 1112
        int n4 = random.nextInt(113) + 1000;
        System.out.println("d) Random integer between 1000 and 1112: " + n4); // Display random integer [cite: 19]

        // e) –1 ≤ n ≤ 1
        int n5 = random.nextInt(3) - 1;
        System.out.println("e) Random integer between -1 and 1: " + n5); // Display random integer [cite: 19]

        // f) –3 ≤ n ≤ 11
        int n6 = random.nextInt(15) - 3;
        System.out.println("f) Random integer between -3 and 11: " + n6); // Display random integer [cite: 19]
    }
}