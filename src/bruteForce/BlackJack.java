package bruteForce;

import java.util.*;

public class BlackJack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum, result= 0;
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = num[i] + num[j] + num[k];
					if (result < sum && sum <= m) {
						result = sum;
					}
				}
			}
		}
		System.out.println(result);
	}

}
