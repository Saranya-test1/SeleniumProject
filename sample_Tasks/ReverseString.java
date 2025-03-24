package sample_Tasks;

public class ReverseString {

	public static void main(String[] args) {
		String value = "Hello";
		String rev = " ";
		for (int i=value.length()-1;i>=0;i--) {
			rev+=value.charAt(i);
		}
		System.out.println("Reversed string is:"+rev);
	}

}
