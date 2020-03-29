package stack;

import java.util.*;

public class Zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i<n; i++) {
			int input = sc.nextInt();
			if(input==0)
				stack.pop();
			else
				stack.push(input);
		}
		sc.close();
		int sum = 0;
		for(int i : stack)
			sum+=i;
		System.out.print(sum);
	}
}