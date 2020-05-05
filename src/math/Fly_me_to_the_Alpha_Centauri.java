package math;

import java.util.*;

public class Fly_me_to_the_Alpha_Centauri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		for(long i = 0; i<t; i++) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			long length = y -x;
			long answer = 1;
			long dis = 0;
			
			while(length>dis) {
				answer++;
				dis+=answer/2;
			}
			System.out.println(answer-1);
		}
	}

}
