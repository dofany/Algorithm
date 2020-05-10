package math3;

import java.util.*;

public class Drainage_Measure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int array[] = new int[2];
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            if (array[0] + array[1] == 0) {
                break;
            } else if (array[0] < array[1] && array[0] % array[1] != 0) {
                System.out.println("factor");
            } else if (array[0] % array[1] != 0) {
                System.out.println("neither");
            } else if (array[0] % array[1] == 0) {
                System.out.println("multiple");
            }
        }
    }
}
