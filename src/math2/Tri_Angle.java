package math2;

import java.util.*;

public class Tri_Angle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int array[] = new int[3];
			for(int i = 0; i<array.length;i++)
			{
				array[i] = sc.nextInt();
			}
			if(array[0]+array[1]+array[2]==0) {
				break;
			}
			else {
				Arrays.sort(array);
				if(Math.pow(array[0], 2)+Math.pow(array[1], 2)==Math.pow(array[2], 2)) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		}
	}

}
