/*write to generate a number based on the input of a user. 
uppper limit of the number should be inclusive*/

import java.util.Scanner;
import java.security.SecureRandom;

public class GenerateNumber{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		SecureRandom secureRandom = new SecureRandom();
		
		System.out.print("Enter number: ");
		long num = input.nextLong();
			
		if(num <= 0){
			System.out.println("num cannot be negative.");
		}
		else{
			long number = secureRandom.nextLong(num) + 1;
			System.out.println("The Lower limit is 0");
			System.out.println("The Upper Limit is "+(num +1));
			
			System.out.printf("The generated number is %d%n",number);
		}
	}
}
