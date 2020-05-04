package hashing;

import java.io.*;
import java.security.*;
import java.util.*;

public class Sha_256 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(testSHA256(st.nextToken()));;
	}

	private static String testSHA256(String str) {
		String SHA = "";
		try {
			MessageDigest sh = MessageDigest.getInstance("SHA-256");
			sh.update(str.getBytes());
			byte byteDate[] = sh.digest();
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i<byteDate.length; i++) {
				sb.append(Integer.toString((byteDate[i]&0xff)+ 0x100, 16).substring(1));
			}
			SHA = sb.toString();
		}catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
			SHA = null;
		}
		return SHA;
	}

}
