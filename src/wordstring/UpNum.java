package wordstring;

import java.util.*;

public class UpNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		num1 = reverse(num1);
		num2 = reverse(num2);
        System.out.println(num1>num2?num1:num2);
    }
    
    public static int reverse(int result){
        String st = "";
        while(result!=0){
            st += (result%10);
            result = result/10;            		
        }
        return Integer.parseInt(st);
	}    
}
