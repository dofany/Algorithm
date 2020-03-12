package stack;

import java.util.*;

public class BeakjoonStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int t = sc.nextInt();
		for(int i = 0; i<t; i++) {
			String st = sc.nextLine();
			int top = -1;
			switch(st) {
			case "push":
				int x = sc.nextInt();
				stack.push(x);
				break;
			case "pop":
				top = -1;
				if(stack.pop()!=0){
				System.out.println(top);
				}
				else {
					top = stack.pop();
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.empty()==true)
					System.out.println("1");
				else
					System.out.println("0");
				break;
			case "top":
				if(stack.peek()==0)
				{
					System.out.println(stack.peek());
				}
				else
				{
					System.out.println(top);
				}
				break;	
			}
		}
	}
}
