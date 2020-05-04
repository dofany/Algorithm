package listSort;

import java.io.*;
import java.util.*;

public class K_Num {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(Quick_Select(n,arr,k-1)+"\n");
		bw.flush();
		bw.close();
		
	}
	
	public static int Quick_Select(int n, int[] ArrList, int k) {
		if(ArrList == null || n<=k)
			return -1;
		int start = 0;
		int end = n-1;
		
		while(start<end) {
			int i = start;
			int j = end;
			int mid = ArrList[(i+j)/2];
			
			while(i<j)
			{
				if(ArrList[i]>=mid)
				{
					int temp = ArrList[j];
					ArrList[j] = ArrList[i];
					ArrList[i] = temp;
					j--;
				}
				else {
					i++;
				}
			}
			if(ArrList[i] > mid)
				i--;
			if(k<=i)
				end=1;
			else
				start = i+1;
		}
		return ArrList[k];
	}
}
