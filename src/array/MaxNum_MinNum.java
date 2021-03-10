package array;

import java.util.Scanner;

public class MaxNum_MinNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 0;
        int array[] = new int[n];
        for(int i = 0; i<n; i++){
            int y = sc.nextInt();
            if(i == 0) {
                max = y;
                min = y;
            }
            else{
                if(y <= min)
                    min = y;
                if(y>= max)
                    max = y;
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
