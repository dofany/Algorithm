package listSort;

import java.util.*;

public class Sort_InSide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		String a = sc.next();
		int size = a.length();
		char[] arr = new char[size];
		
		for(int i = 0; i<a.length();i++) {
			arr[i] = a.charAt(i);
		}
		Arrays.sort(arr);
		
		for(int i = arr.length-1;i>=0; i--)
			System.out.print(arr[i]);
	}

}
