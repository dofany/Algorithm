package wordstring;

import java.util.*;

public class Dior {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		
		int sum = 0;
		
		for(char i : ch) {
			sum += dior(i)+1;
		}
		System.out.println(sum);
	}
	public static int dior(char phone) {
		switch(phone) {
		case 'A': case 'B': case 'C':
			return 2;
		case 'D': case 'E': case 'F':
			return 3;
		case 'G': case 'H': case 'I':
			return 4;
		case 'J': case 'K': case 'L':
			return 5;
		case 'M': case 'N': case 'O':
			return 6;
		case 'P': case 'Q': case 'R': case 'S':
			return 7;
		case 'T': case 'U': case 'V':
			return 8;
		case 'W': case 'X': case 'Y': case 'Z':
			return 9;
		default :
			return -1;
		}
	}
}
