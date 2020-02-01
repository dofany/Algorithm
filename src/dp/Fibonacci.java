package dp;

import java.util.Scanner;

public class Fibonacci {

	 static int fibonacci(int n) {
		if(n==0) {
			System.out.print("0");
			return 0;
		}else if(n==1) {
			System.out.print("1");
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = 0;
		for(int i = 0; i<t; i++) {
			n = sc.nextInt();
			fibonacci(n);
			System.out.println(n);
		}
	}
}
