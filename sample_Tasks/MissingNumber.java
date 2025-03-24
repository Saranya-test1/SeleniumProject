package sample_Tasks;

public class MissingNumber {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6};
		int n = numbers.length+1;		/*
		 * int n = largest(numbers); int missing = findMissing(numbers, n);
		 * System.out.print(missing);
		 */
		System.out.println("Missing Number is:"+findMissing(numbers, n));
		
	}
	public static int findMissing(int[] numbers,int n) {
		
		int expected = n*(n+1)/2;
		int actual = 0;
		for(int num: numbers) {
 				actual += num;
			}
			return expected - actual;
		}

		/*
		 * public static int largest(int[] numbers) { int max = numbers[0]; for(int n:
		 * numbers) { if(n>max) { max = n; }
		 * 
		 * } return max; }
		 */
}
