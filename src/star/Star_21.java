package star;

import java.util.*;

public class Star_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n*2; i++) {
			if(i%2==1) {
				for(int j =1; j<=n; j++) {
					if(j%2==1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			else {
				for(int j =1; j<=n; j++) {
					if(j%2==1) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}

	}
}
