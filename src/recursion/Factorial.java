package recursion;


import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n<=1){
            return n;
        }else{
            return fact(n-1)*n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fact(x));
    }
}
