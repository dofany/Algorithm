package backtracking;

import java.util.*;
import java.io.*;

public class Make_Password {

	static boolean[] visit;
	static String[] code;
	static int l, c;

	private static void backtracking(int start, int end) {
		if (end == 1) {
			int vow = 0;
			int cons = 0;
			String ans = "";
			for (int i = 0; i < c; i++) {
				if (visit[i]) {
					ans += code[i];
					if (code[i].equals("a") || code[i].equals("e") || code[i].equals("i") || code[i].equals("o")
							|| code[i].equals("u"))
						vow++;
					else
						cons++;
				}
			}
			if (vow >= 1 && cons >= 2)
				System.out.println(ans);
			return;
		}
		for (int i = start; i < c; i++) {
			visit[i] = true;
			backtracking(i + 1, end + 1);
			visit[i] = false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split("\\s");
		code = br.readLine().split("\\s");
		
		l = Integer.parseInt(line[0]);
		c = Integer.parseInt(line[1]);
		visit = new boolean[c];
		Arrays.sort(code);
		
		backtracking(0,0);
	}

}
