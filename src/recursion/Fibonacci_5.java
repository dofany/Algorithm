package recursion;

import java.util.*;

public class Fibonacci_5 {
	
	public static int fibonacci(int n) {
		if(n<=1)
			return n;
		else
			return fibonacci(n-2) + fibonacci(n-1);
	}

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println(fibonacci(x));
	}
}