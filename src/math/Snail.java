package math;

import java.io.*;

public class Snail {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);
		
		v -= a;
		a -= b;
		
		if(v%a == 0) {
			System.out.println((v/a)+1);
		}
		else {
			System.out.println((v/a)+2);
		}
		
	}
}