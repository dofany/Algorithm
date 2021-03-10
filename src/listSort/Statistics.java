package listSort;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] num = new double[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();
            sc.close();

        double sum = 0;
        for (double d : num)
            sum += d;
        System.out.println((int) Math.round(sum / n));
        Arrays.sort(num);
        System.out.println((int) num[n / 2]);

        int[] freq = new int[8001];
        for (double d : num) freq[(int) d + 4000]++;
        int maxFrequency = 0;
        int maxIndex = 0;
        for (int i = 0; i < 8001; i++)
            if (freq[i] > maxFrequency) maxFrequency = freq[i];
        boolean twice = false;
        for (int i = 0; i < 8001; i++) {
            if (freq[i] == maxFrequency) {
                if (twice) {
                    maxIndex = i - 4000;
                    break;
                }
                maxIndex = i - 4000;
                twice = true;
            }
        }
        System.out.println(n == 1 ? (int) num[0] : maxIndex);
        System.out.println((int) (num[n - 1] - num[0]));


    }
}
