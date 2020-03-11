package math;

import java.util.*;

public class VicePresident {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result = 0;
		for(int i = 0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			result = (k+i)+(n+i);
			i++;
			System.out.println(result);
		}
	}

}
