package math2;

import java.util.*;
import java.io.*;

public class Bertrang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(true){
            n = sc.nextInt();
            if(n == 0)
                break;
            int m = n*2;
            int count = 0;
            boolean[] data = new boolean[m+1];
            data[0] = false;
            data[1] = false;
            for(int i = 2; i<=m; i++)
                data[i] = true;
            for(int i = 2; i<=m; i++)
                for(int j = 2; j*i<=m;j++)
                    data[i*j] = false;
                for(int i = n+1; i<data.length; i++)
                    if(data[i])
                        count++;
            System.out.println(count);
        }

    }
}

/*
Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int result = 0;
		int count = 0;
		int min = 10001;
		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 0 && i != 1) {
				result += i;
				if (min > i)
					min = i;
			}
			count = 0;
		}
		if (min == 10001) {
			System.out.println("-1");
		} else {
			System.out.println(result);
			System.out.println(min);
		}
*/

