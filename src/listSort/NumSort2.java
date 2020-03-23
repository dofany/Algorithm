package listSort;

import java.io.*;
import java.util.*;

public class NumSort2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<array; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);
		for(int i = 0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
