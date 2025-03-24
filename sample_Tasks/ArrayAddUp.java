package sample_Tasks;

public class ArrayAddUp {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,5,2,3,4,8,6,5,3};
		int target = 9;
		findPairs(numbers, target);
	}
	public static void findPairs(int[] numbers, int target) {
		int n = numbers.length;
		for(int i = 0; i<n; i++) {
			for(int j=i+i;j<n;j++) {
				if(numbers[i]+numbers[j] == target) {
					System.out.println(numbers[i]+" "+numbers[j]);
				}
			}
		}
	}

	

}
