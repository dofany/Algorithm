import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] b = a.split(" ");

        System.out.println(Integer.toString(Integer.parseInt(b[0]), Integer.parseInt(b[1])).toUpperCase());
    }
}