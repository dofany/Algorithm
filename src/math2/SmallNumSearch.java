package math2;

import java.util.*;

public class SmallNumSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int count = 0;
		int t = sc.nextInt();
		for(int i = 1; i<=t; i++) {
			int num = sc.nextInt();
			number = 0;
			for(int j = 1; j<=num; j++) {
				if(num%j==0)
					number++;
			}
			if(number==2)
				count++;
		}
		System.out.println(count);
	}
}
