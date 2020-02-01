package String;

import java.util.Scanner;

public class AlphabatSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s = "";
		String st = "";
		for(int i = 0; i<t; i++) {
			int p = sc.nextInt();
			for(int j = 0; j<p; j++) {
				s = sc.nextLine();
				System.out.println(s);
			}
			for(int k = 0; k<p; k++) {
				st = sc.nextLine();
				System.out.println(st);
			}
		}
	}
}
