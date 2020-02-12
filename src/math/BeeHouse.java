package math;

import java.util.*;

public class BeeHouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int check = 1;
		int end = 6;
		int result = 1;
		
		while(true) {
			if(n<=check) {
				break;
			}
			check += end;
			end += 6;
			result ++;
		}
		System.out.println(result);
	}
}
