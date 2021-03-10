package recursion;

import java.util.Scanner;

public class HanoiTop {
    static int n, count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int n, int from, int by, int to) {
        count++;
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }
        hanoi(n-1,from,to,by);
        sb.append(from + " " + to + "\n");
        hanoi(n-1,by,from,to);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append((int)(Math.pow(2,n)-1)).append('\n');
        hanoi(n,1,2,3);
        System.out.println(sb);
    }
}
