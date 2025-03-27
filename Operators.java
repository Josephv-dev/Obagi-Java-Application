public class Operators{
	public static void main(String[] args){
		//Assignment operator(=)
		
		int num1 = 13;
		int num2 = 5;
		
		num1 += num2;
		
		//Arthmetic operator(+,*,-,/,%)
		int sum = num1 + num2;
		
		int product = num1 * num2;
		
		int difference = num1 - num2;
		
		double quotient = (double)num1 / num2;
		
		int remainder = num1 % num2;
		
		//Relational Operators(>,<,>=,<=,==,!=)
		boolean isLessThan = num1 < num2;
		boolean isGreaterthan = num1 > num2;
		boolean isGreaterthanOrEqualTo = num1 >= num2;
		boolean isLessthanOrEqualTo = num1 <= num2;
		boolean isEqualTo = num1 == num2;
		boolean isNotEqualTo = num1 != num2;
		
		//Logical Operators(&&,||,!)
		boolean isAndOperator = num1 > num2 && num1 >= num2; 
		boolean isOrOperator = num1 == num2 || num1 > num2;
		boolean isNotOperator = !(num1 == num2 || num1 > num2);
		 
				
		System.out.printf("The sum of the numbers is %d%n",sum);
		System.out.printf("The product of the numbers is %d%n",product);
		System.out.printf("The difference %d and %d is %d%n",num1,num2,difference);
		System.out.printf("The quotient is %.2f%n",quotient);
		System.out.printf("The remainder is %d%n",remainder);
		System.out.printf("===========================================%n");
		System.out.printf("Is %d < %d? %b%n",num1, num2, isLessThan);
		System.out.printf("Is %d > %d? %b%n",num1, num2, isGreaterthan);
		System.out.printf("Is %d >= %d? %b%n",num1, num2, isGreaterthanOrEqualTo);
		System.out.printf("Is %d <= %d? %b%n",num1, num2, isLessthanOrEqualTo);
		System.out.printf("Is %d == %d? %b%n",num1, num2, isEqualTo);
		System.out.printf("Is %d != %d? %b%n",num1, num2, isNotEqualTo);
		System.out.printf("===========================================%n");
		System.out.printf("Is %d > %d && %d >= %d? %b%n",num1, num2, num1, num2, isAndOperator);
		System.out.printf("Is %d == %d || %d > %d? %b%n",num1, num2, num1, num2, isOrOperator);
		System.out.printf("Is !(%d == %d || %d > %d)? %b%n",num1, num2, num1, num2, isNotOperator); 
	}
}