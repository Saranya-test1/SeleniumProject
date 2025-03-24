package sample_Tasks;

public class PalindromeChecker {
	public static boolean findPalindrome(String str) {
		str = str.toLowerCase();
		int left = 0, right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(findPalindrome("Racecar"));
		System.out.println(findPalindrome("Hello"));
		System.out.println(findPalindrome("Madam"));
	}

}
