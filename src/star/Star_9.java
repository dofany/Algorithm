package star;

import java.util.Scanner;

public class Star_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			for(int j = 1; j<2*n; j++) {
				if(j==2 * n-i)
					break;
				if(j>0+i&&j<2*n-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = 1; i<n; i++) {
			for(int j = 1; j<2*n; j++) {
				if(j>n+i)
					break;
				if(j>=n-i && j<=n+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}