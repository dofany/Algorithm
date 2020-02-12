package wordstring;

import java.util.*;

public class GroupChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		String[] word = new String[num];
		char[] ch;
		
		int check = 0;
		int result = 0;
		
		for(int i = 0; i<num; i++) {
			word[i] = sc.next();
			ch = word[i].toCharArray();
			for(int j = 0; j<ch.length; j++) {
				for(int k=j+1; k<ch.length; k++) {
					if(ch[j]==ch[k] && ch[j]!=ch[k-1]) {
						check = 1;
					}
				}
			}

			if(check == 0) {
				result += 1;
			}
			check = 0;
		}
		System.out.println(result);
	}
}

