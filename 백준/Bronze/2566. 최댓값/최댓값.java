import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int index1 = 0;
        int index2 = 0;

        for(int i = 0; i < 9; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < 9; j++) {
                int a = Integer.parseInt(line[j]);
                if(a > result) {
                    result = a;
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println(result);
        System.out.println((index1 +1) + " " + (index2+1));

    }
}