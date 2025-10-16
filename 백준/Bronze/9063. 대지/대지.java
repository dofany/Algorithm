import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(parts[0]);
            arr[i][1] = Integer.parseInt(parts[1]);
        }

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = arr[i][0];
            y[i] = arr[i][1];
        }

        Arrays.sort(x);
        Arrays.sort(y);

        for (int i = 0; i < n / 2; i++) {
            int tmp = x[i];
            x[i] = x[n - 1 - i];
            x[n - 1 - i] = tmp;

            tmp = y[i];
            y[i] = y[n - 1 - i];
            y[n - 1 - i] = tmp;
        }

        int minx = x[0];
        int miny = y[0];
        int maxx = x[n - 1];
        int maxy = y[n - 1];

        System.out.println((maxx - minx) * (maxy - miny));

    }
}