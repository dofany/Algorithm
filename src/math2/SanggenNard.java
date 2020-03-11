package math2;

import java.util.*;

public class SanggenNard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int min = 0;
		int input;
		
		min = sc.nextInt();
		for(int i = 0; i<2; i++) {
			input = sc.nextInt();
			if(min>input)
				min = input;
		}
		result += min;
		
		min = 0;
		min = sc.nextInt();
		for(int i = 0; i<1; i++) {
			input = sc.nextInt();
			if(min>input)
				min = input;
		}
		result +=(min-50);
		System.out.println(result);
	}
}
