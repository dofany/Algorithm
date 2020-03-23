package listSort;

import java.util.*;

public class NumSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array = sc.nextInt();
		int[] data = new int[array];
		int temp;
		
		for(int i = 0; i<data.length; i++) {
			data[i] = sc.nextInt();
		}
		for(int i =data.length; i>0; i--) {
			for(int j = 0; j<i-1; j++) {
				if(data[j]>data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		for(int k = 0; k<data.length; k++) {
			System.out.println(data[k]+" ");
		}
	}
}
