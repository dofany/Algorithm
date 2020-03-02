package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcmHotel {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<t; i++) {
			int h = Integer.parseInt(br.readLine());
			int w = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int x = (n/h)+1;
			int y = n%h;
			if(n%h==0) {
				x = n/h;
				y = h;
			}
			System.out.println(y*100+x);
		}
	}
}