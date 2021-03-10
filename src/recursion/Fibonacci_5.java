package recursion;

import java.util.*;

public class Fibonacci_5 {
	public static int fibonacci(int n){
		if(n<=1) {
			return n;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(fibonacci(x));
	}
}