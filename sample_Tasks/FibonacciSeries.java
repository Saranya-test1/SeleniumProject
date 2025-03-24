package sample_Tasks;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a =0, b=1, temp;
		System.out.print("Fibonacci Series is:"+a+" "+b+" ");
		for(int i=2;i<=10;i++) {
			temp = a+b;
			System.out.print(temp +" ");
			a = b; 
			b = temp;
		}

	}

}
