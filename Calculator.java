import java.util.Scanner;

public class studentScores{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		int name = input.nextLine();
		
		System.out.print("Enter your Score: ");
		double score = input.nextDouble();
		System.out.println();
		
		if (score > 100){
			System.out.print("Invalid Score)
			
		}
		else{
			if (score >= 80){
				System.out.printf("%s-%f Grade%c",'A',name,score);
			}
			if (Score >= 70){
				System.out.printf("%s-%f Grade%c",'B',name,score);
			}
			if (Score >= 60){
				System.out.printf("%s-%f Grade%c",'C',name,score);
			}
			if (Score >= 50){
				System.out.printf("%s-%f Grade%c",'D',name,score);
			}
			if (Score >= 40){
				System.out.printf("%s-%f Grade%c",'E',name,score);
			}
			if (Score < 40){
				System.out.printf("%s-%f Grade%c",'F',name,score);
			}
			else{
				System.out.println("invalid Score")
			}
		}
	}
}