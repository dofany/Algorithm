package wordstring;

import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];
		
		int len = str.length();
		
		for(int i = 0; i<len; i++) {
			int idx = Character.toLowerCase(str.charAt(i))-'a';
			arr[idx]++;
		}
		
		int max = -1;
		char answer = '?';
		for(int i = 0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer = (char)(i+65);
			}
			else if(arr[i] == max)
				answer = '?';
		}
		
		System.out.println(answer);
	}		
}

