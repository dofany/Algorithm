import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        int v = x + y + z;

        if (x == 60 && y == 60 && z == 60) {
            System.out.println("Equilateral");
        }

        if (v == 180 && x != y && y != z && x != z) {
            System.out.println("Scalene");
        }

        if(v == 180 && (x == y && x != z) || (x == z && x != y) || (y == z && y != x)) {
            System.out.println("Isosceles");
        }

        if(v != 180){
            System.out.println("Error");
        }

    }
}