package search;

import java.util.Arrays;
import java.util.Scanner;

public class Lan_Cutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n = sc.nextLong();
        long array[] = new long[k];
        long max = 0;
        for(int i = 0; i<k; i++) {
            array[i] = sc.nextInt();
            max = Math.max(max,array[i]);
        }
            long left = 1;
            long right = max;
            while(left <= right){
                long mid = (left+right)/2;
                long sum = 0;
                for(int i =0; i<k; i++){
                    sum += (array[i]/mid);
                }
                if(sum >= n){
                    left = mid +1;
                } else{
                    right = mid -1;
                }
            }
        System.out.print(right);

    }
}
