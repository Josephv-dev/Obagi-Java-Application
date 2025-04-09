import java.util.Random;

public class RandomClassGenerator{
	public static void main(String[] args){
		Random random = new Random();
		
		boolean option = random.nextBoolean();
		System.out.printf("Do you Love Java %b%n", option);
		
		int integerWithNoBound = random.nextInt();
		System.out.printf("The random number is %d%n", integerWithNoBound);
		
		int integerWithBound = random.nextInt(2000) + 1;
		System.out.printf("The random number is %d%n", integerWithBound);
		
		long longWithBound = random.nextLong( );
		System.out.printf("The random number is %d%n", longWithBound);
		
		float floatWithBound = random.nextFloat( );
		System.out.printf("The random number is %f%n", floatWithBound);
		
		double doubleWithBound = random.nextDouble( );
		System.out.printf("The random number is %f%n", doubleWithBound);
		
		
	}
}