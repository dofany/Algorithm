package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcmHotel {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int index = 0; i<t; ++index) {
			int h = Integer.parseInt(br.readLine());
			int w = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int number = (n/h)+1;
			int layer = n%h;
			if(n%h==0) {
				number = n/h;
				layer = h;
			}
			System.out.println(y*100+x);
		}
	}
}
