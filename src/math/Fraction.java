package math;

import java.util.*;

public class Fraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x=0,y=0,z = 0;
		for(int i = 0; i<1000; i++) {
			if(num>x && x+i>=num) {
				if(i%2==0) {
					y=i+1-(num-x);
					z=(num-x);
				}
				else {
					y=(num-x);
					z=i+1-(num-x);
				}
				break;
			}
			x+=i;
		}
		System.out.println(z+"/"+y);
	}
}
