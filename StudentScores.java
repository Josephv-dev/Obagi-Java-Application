import java.util.Scanner;
import java.util.Random;

public class GuessANumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random random = new Random(System.in);
		
		int randomNumber = random.nextInt(100)+1;		
		
		int number = input.nextInt();
		
		if (num == randomNumber){
			System.out.printf("Your Guess is correct %d",randomNumber);
			
		}
		else{
			System.out.print("Try again");
		}
	}
	
}