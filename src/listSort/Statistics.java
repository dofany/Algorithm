package listSort;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int[] result = new int[4];
        int[] array = new int[n];
        int[] much_number = new int[8001];

        for(int i = 0; i<n; i++){
            array[i] = sc.nextInt();
            total += array[i];
            much_number[array[i] + 4000]++;
        }
        int min = 0;
        for(int i = 0; i<much_number.length; i++){
            if(min<much_number[i]){
                min = much_number[i];
            }
        }
        int[] min2 = new int[2];
        int j = 0;
        for(int i = 0; i<much_number.length;i++){
            if(min2[0] != 0 && min2[1] != 0)
                break;
            if(min == much_number[i]){
                min2[j] = i;
                j++;
            }
        }
        if(min2[1]==0)
            min2[1] = min2[0];
        Arrays.sort(array);
        result[0] = (int)Math.round((double)total /n);
        result[1] = array[n/2];
        result[2] = min2[1] - 4000;
        result[3] = array[n-1] - array[0];

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        System.out.println(result[3]);
    }
}
