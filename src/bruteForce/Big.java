package bruteForce;

import java.util.*;

public class Big {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] a = new int[t][2];
		int[] b = new int[t];
		
		for(int i = 0; i<t; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		for(int i =0; i<t; i++) {
			for(int j = 0; j<t; j++) {
				if(i!=j && a[i][0]<a[j][0] &&a[i][1]<a[j][1]) {
					b[i]++;
				}
			}
		}
		for(int i =0; i<t; i++) {
			System.out.print(b[i]+1);
			if(i!=t-1) {
				System.out.print(" ");
			}
			else
				System.out.println();
		}
	}
}
