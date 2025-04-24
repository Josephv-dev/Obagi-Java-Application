public class SingleDimentionalArrays{
	public static void main(String[] args){
		
		int[] numbers = {5,7,3,9,2};
		int length = numbers.length;
		
		String[] names = {"Joseph","Praise Jah","Emmanuel","Praise","Samuel"};
		System.out.println("This is the traditional for loop");
		
		for(int i = 0; i < 5; i++){
			System.out.printf("%s is %d years old %n",names[i], numbers[i]);
		}
		
		System.out.println("-----------------------------------------------");
		for(String [2] : names){
			System.out.printf("%s%n",name);
		}
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
	}
}