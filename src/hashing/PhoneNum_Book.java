package hashing;

import java.util.*;
import java.io.*;

public class PhoneNum_Book {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String[] phoneNum = new String[n];
			for (int i = 0; i < n; i++)
				phoneNum[i] = br.readLine();

			Arrays.sort(phoneNum);
			boolean check = true;
			for (int i = 1; i < n && check; i++)
				check = !phoneNum[i].startsWith(phoneNum[i - 1]);
			System.out.println(check ? "YES" : "NO");
		}
	}
}