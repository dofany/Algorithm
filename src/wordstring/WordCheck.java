package wordstring;

import java.util.*;

public class WordCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String[] str = st.split(" ");
		int count = str.length;
		for(int i = 0; i<str.length; i++) {
			if(str[i].equals("")) {
				count--;
			}
		}
		System.out.println(count);
	}
}
