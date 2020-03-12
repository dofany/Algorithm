package math2;

import java.util.*;

public class SmallNumCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int check = 0;

		for (int i = t1; i <= t2; i++) {
			if (i == 1) {
				check = 1;
			}
			int tt2 = (int) Math.sqrt(i) + 1;
			for (int j = 2; j < tt2; j++) {
				if (t1 % t2 == 0) {
					check = 1;
					break;
				}
			}

			if (check == 0) {
				System.out.println(i);
			}
			check = 0;
		}
	}
}
