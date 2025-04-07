import java.util.Scanner;

public class BankAccount{
	String accountName = "John";
	String accountNumber = "1234567897";
	double accountBalance = 98273.66;
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to UBA Bank");
		System.out.println("Enter 1 to withdraw");
		System.out.println("Enter 2 to deposit");
		
		System.out.println("Enter your choice");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.println("Enter amount to Withdraw: ");
				int amount = input.nextInt();
				
				
				System.out.printf("Account name is %s%n",bank.accountName);
				System.out.printf("Account number is %s%n",bank.accountNumber);
				System.out.printf("Account name is %.2f%n",bank.accountBalance);
			
				bank.withdrawal(amount);
				System.out.printf("Your balance is %.2f%n",bank.accountBalance);
			}
			break;
			
			case 2:
			{
				System.out.println("Enter amount to Deposit: ");
				int amount = input.nextInt();
				
				System.out.printf("Account name is %s%n",bank.accountName);
				System.out.printf("Account number is %s%n",bank.accountNumber);
				System.out.printf("Account name is %.2f%n",bank.accountBalance);
			
				bank.deposit(amount);
				System.out.printf("Your balance is %.2f%n",bank.accountBalance);
			}
			break;
			default:
			
			System.out.println("Invalid Input");
		}
		
	}
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		return accountBalance;
	}
	
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
}