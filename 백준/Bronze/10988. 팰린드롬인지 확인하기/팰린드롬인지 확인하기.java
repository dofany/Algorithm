import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String result = new StringBuilder(input).reverse().toString();

        if(input.equals(result) && input.length() <= 100) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}