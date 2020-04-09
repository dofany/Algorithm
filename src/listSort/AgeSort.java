package listSort;

import java.util.*;

public class AgeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String age[][] = new String[n][2];
		for(int i = 0; i<age.length; i++) {
			age[i][0] = sc.next();
			age[i][1] = sc.next();
			
		}
		Arrays.sort(age,new Comparator<String[]>() {
			@Override
			public int compare(String[]p1,String[]p2) {
				return Integer.compare(Integer.parseInt(p1[0]), Integer.parseInt(p2[0]));
			}
		});
		for(String[]ar:age) {
			System.out.println(ar[0] + " " + ar[1]);
		}
	}

}
