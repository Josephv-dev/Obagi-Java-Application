//Exercise 5.35

import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationCAI {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        int num1, num2, answer, studentAnswer;
		
		while (true) {
			num1 = random.nextInt(9) + 1; // Generate random numbers [cite: 95, 96, 97, 98, 99, 100, 101, 102]
            num2 = random.nextInt(9) + 1;
            answer = num1 * num2;
			System.out.printf("How much is %d times %d? ", num1, num2); // Prompt user [cite: 96]
            studentAnswer = scanner.nextInt();

            if (studentAnswer == answer) {
                System.out.println("Very good!"); // Correct answer [cite: 98]
			}else {
                System.out.println("No. Please try again."); // Incorrect answer [cite: 99, 100]
                while (studentAnswer != answer) {
                    System.out.printf("How much is %d times %d? ", num1, num2);
					studentAnswer = scanner.nextInt();
					
					if (studentAnswer == answer) {
                        System.out.println("Very good!");
                        break;
                    } else {
                        System.out.println("No. Please try again.");
                    }
				}
			}
		}
	}
    
}