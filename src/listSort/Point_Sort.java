package listSort;

import java.util.*;

public class Point_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			array[i][0] = sc.nextInt();
			array[i][1] = sc.nextInt();
		}

		Arrays.sort(array, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				} else
					return Integer.compare(o1[0], o2[0]);
			}
		});
		for (int i = 0; i < n; i++)
			System.out.println(array[i][0] + " " + array[i][1]);
	}

}
