public class MultiDimentionArrays{
	public static void main(String[] args){
		int[][] numbers = {
			{5,6,8,3,2},
			{9,3,2,7,8},
			{1,6,4,5,3},
		};
		
		int sum = 0;
		int even = 0;
		int odd = 0;
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 5; col++){
				sum += numbers[row][col];
				
				if(numbers[row][col] % 2 == 0){
					even++;
				}
				else{
					odd++;
				}
			}
		}
		System.out.printf("The sum is %d%n",sum);
		System.out.printf("The number even numbers are %d%n",even);
		System.out.printf("The number odd numbers are %d%n",odd);
	}
}
