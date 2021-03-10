package search;

import java.util.Scanner;

public class Lan_Cutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int array[] = new int[k];
        int sum = 0;
        int avg = 0;
        int result = 0;
        for(int i = 0; i<k; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
            avg = sum / n;
            result = avg-(avg%100);
        }

        System.out.println(result);
    }
}
