package dp;

import java.util.Scanner;

public class OneTwoThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		int[] array = new int[t];

		
		for(int i = 0; i<t; i++) {
			n = sc.nextInt();
			for(int j = 0; j<=n; j++) {
				array[j] = array[j-1] + array[j-2] + array[j-3];
			}
			System.out.println(array[n]);
		}
	}
}
