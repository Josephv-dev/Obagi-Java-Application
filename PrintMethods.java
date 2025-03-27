public class PrintMethods{
	public static void main(String[] args){
		//Using the print ()
		System.out.print("\"Learning Java is fun\"\n");
		System.out.print(" Hey, ccome and Learn Java with me");
		
		// Using the println
		System.out.println();
		System.out.println("I want to tell you that Java is different from javascript");
		System.out.println("\t this is the indented text");
		
		// Using th printf()
		System.out.printf("My name is %s and i love %s%n","John","Java");
		System.out.printf("I am living in No. %d kaduna Street%n",1);
		System.out.printf("I bought Java JDK with %f Naira%n",159.245);
		System.out.printf("I bought Java JDK with %.2f Naira%n",159.245);
		System.out.printf("I bought Java JDK with %c%f %n",'$',159.245);
	}
}