package dp;

import java.util.Scanner;

public class OneTwoThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		int[] array = new int[11];
		array[1] = 1;
		array[2] = 2;
		array[3] = 4;
		
		for(int i = 0; i<t; i++) {
			n = sc.nextInt();
			for(int j = 0; j<=n; j++) {
				array[j] = array[j-1] + array[j-2] + array[j-3];
			}
			System.out.println(array[n]);
		}
	}
}
