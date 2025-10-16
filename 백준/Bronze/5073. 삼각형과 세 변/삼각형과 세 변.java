import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] parts = br.readLine().split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            int z = Integer.parseInt(parts[2]);

            if(x == 0 && y == 0 && z == 0) {
                break;
            }

            int[] a = {x, y, z};
            Arrays.sort(a);               

            // 1) 유효성 먼저 검사
            if (a[2] >= a[0] + a[1]) {
                System.out.println("Invalid");
                continue;
            }

            if (a[0] == a[2]) {           
                System.out.println("Equilateral");
            } else if (a[0] == a[1] || a[1] == a[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }


        }
    }
}