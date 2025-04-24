
public class CalculateSum{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,8};
		
		int sumOf4_6 = 0;
		int sumOf5_9 = 0;
		
		for(int i = 1; i < 10; i++){
			if(i >= 4 && i <= 6){
				sumOf4_6 += arr[i];
			}
			
			if(i >= 5 && i <= 9){
				sumOf5_9 += arr[i];
			}
			
			
			
		}
		int result = sumOf4_6 * sumOf5_9;
		
		if(result % 2 == 0){
			System.out.printf("Even Number is %d%n",result);
		}
	}
}
