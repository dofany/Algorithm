package listSort;

import java.io.*;
import java.util.*;
public class NumSort3 {

	public static void main(String[] args) throws Exception{
		solution();
	}
		public static void solution() throws Exception{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int N = Integer.parseInt(reader.readLine());
	        int[] arr = new int[N];
	        
	        for(int i=0 ; i<arr.length ; i++)
	            arr[i] = Integer.parseInt(reader.readLine());
	        
	        Arrays.sort(arr);
	        
	        StringBuilder builder = new StringBuilder();
	        for(int i=0 ; i<arr.length ; i++)
	            builder.append(arr[i]).append("\n");
	        
	        System.out.println(builder);
	}
}
