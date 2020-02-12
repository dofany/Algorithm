package wordstring;

import java.util.*;
public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		String text[] = new String[tc];
		int count[] = new int[tc];
		for(int i = 0; i<tc; i++) {
			count[i] = sc.nextInt();
			text[i] = sc.next();
		}
		for(int j = 0; j<tc; j++) {
			char[] temp = text[j].toCharArray();
			for(int k = 0; k<temp.length; k++) {
				for(int l = 0; l<count[j]; l++) {
					System.out.print(temp[k]);
				}
			}
			System.out.println();
		}
	}
}