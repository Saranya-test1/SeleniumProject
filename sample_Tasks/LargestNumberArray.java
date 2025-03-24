package sample_Tasks;

public class LargestNumberArray {
	public static void main(String[] args) {
		int[] numbers = {43,343,32,65};
		System.out.println("Largest number in an array:"+findLargest(numbers));
	}
	public static int findLargest(int[] numbers) {
		int max = numbers[0];
		for(int num: numbers) {
			if(num>max) {
				max = num;
			}
			
		}
		return max;
	}
	

}
