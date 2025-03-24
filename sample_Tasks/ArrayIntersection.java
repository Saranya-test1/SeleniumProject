package sample_Tasks;

import java.util.HashSet;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] array1 = {1,2,11,3,4,5,6};
		int[] array2 = {4,5,6,7,8,9,11};
		findIntersection(array1, array2);
		
	}
	public static void findIntersection(int[] arr, int[] arr1) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> intersection = new HashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		for(int num: arr1) {
			if(set.contains(num)) {
				intersection.add(num);
			}
		}
		System.out.println(intersection);
	}

}
