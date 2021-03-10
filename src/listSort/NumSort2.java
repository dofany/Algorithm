package listSort;

import java.io.*;
import java.util.*;

public class NumSort2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i< n; i++){
			arr.add(sc.nextInt());
		}
		Collections.sort(arr);

		for(int value : arr){
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
