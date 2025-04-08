import java.util.Scanner;


public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate the parimeter of different shapes");
		System.out.println("Enter 1 to Calculate the parimeter od a Square");
		System.out.println("Enter 2 to Calculate the parimeter of a Rectangle");
		System.out.println("Enter 3 to Calculate the parimeter of a Circle");
		System.out.println();
		
		System.out.print("Eter your choice");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the length of a square: ");
				int lengthOfSquare = input.nextInt();
				
				MethodOverLoading.shape(lengthOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the length of a Rectangle: ");
				int lengthOfRectangle = input.nextInt();
				
				System.out.print("Enter the breadth of a Rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lengthOfRectangle, breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				System.out.print("Enter the raduis of a circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			
			default:
			System.out.println("Invalid Input");
		}
	}
	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimeter of square is %d%n", perimeterOfSquare);
	}
	
	public static void shape(int length, int breadth){
		int perimeterOfRectangle = 2*(length*breadth);
		
		System.out.printf("The perimeter of Rectangle is %d%n", perimeterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimeterOfCircle = 2 * Math.PI * radius;
		
		System.out.printf("The perimeter of Circle is %f%n", perimeterOfCircle);
	}
}