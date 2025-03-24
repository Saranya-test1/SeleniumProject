package sample_Tasks;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] numbers = {1,45,5,35,32,24};
		int firstlargest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for(int num: numbers) {
			if(num>firstlargest) {
				secondlargest = firstlargest;
				firstlargest = num;
			}
			else if(num>secondlargest&&num<firstlargest) {
				secondlargest = num;
			}
		}
		if(secondlargest == Integer.MIN_VALUE) {
			System.out.println("No second largest number is found");
		}
		else {
			System.out.println("Second largest number is:"+secondlargest);
		}
		
	}
	

}
