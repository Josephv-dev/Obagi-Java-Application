public class TypeCasting{
	public static void main(String[] args){
		//Widening Type Casting
		double weight = 678;
		System.out.printf("Your weight is %f%n",weight);
		
		//Narrowing Type Casting ASCII Code ? = 63
		char alpha = '?';
		
		int asciiCode =  (char)alpha;
		System.out.printf("the Ascii code for ? is %d%n",asciiCode);
		
		double height = 5.8;
		
		int myHeight = (int) height;
		System.out.printf("My faculty's height is %d%n",myHeight);
		
		double temperatureCelsius = 25.7;
		int wholeCelsius = (int) temperatureCelsius;
		String celsius = String.valueOf(wholeCelsius);
		
		System.out.printf("wholeCelsius is %s%n",celsius);
		
		long totalSecond = 1583;
		int totalSec = (int)totalSecond/60;
		float secn = (int) totalSec;
		
		System.out.println(totalSec);
		System.out.println(secn);
		
		double radius = 3.7;
		int area = (int) (Math.PI*radius*radius);
		float originalRadius = (float) radius;
		
		System.out.println(originalRadius);
		System.out.println(area);
		
		double miles = 15.2;
		long longMiles = (long) (miles*1.60934);
		short shortMiles =(short) miles;
		System.out.println(longMiles);
		System.out.println(shortMiles);
		
		double meters = 2500.5;
		double centimeter = meters*100;
		double kilometers = meters/1000;
		
		long longMeters = (long) centimeter;
		float shortMeters = (float) kilometers;
		
		System.out.println(longMeters);
		System.out.println(shortMeters);
		
		double grams = 7500.8;
		int intGrams = (int) (grams/1000);
		long longGrams = (long) (grams*1000);
		
		System.out.println(intGrams);
		System.out.println(longGrams);
	}
}