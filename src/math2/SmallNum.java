package math2;

import java.util.Scanner;

public class SmallNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		int count = 0;
		int min = 10001;
		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 0 && i != 1) {
				result += i;
				if (min > i)
					min = i;
			}
			count = 0;
		}
		if (min == 10001) {
			System.out.println("-1");
		} else {
			System.out.println(result);
			System.out.println(min);
		}
	}
}
