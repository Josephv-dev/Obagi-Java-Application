import java.util.Scanner;

public class GettingNameAndGreeting{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter your address: ");
		String address = input.nextLine();
		System.out.println();
		
		System.out.printf("My name is %s%n",name);
		System.out.printf("My address is %s%n",address);
	}
}