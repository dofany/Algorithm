package math2;

import java.util.*;

public class FourPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1[] = {sc.nextInt() , sc.nextInt()};
        int a2[] = {sc.nextInt() , sc.nextInt()};
        int a3[] = {sc.nextInt() , sc.nextInt()};

        sc.close();

        int x,y;

        if (a1[0] == a2[0]) {
            x = a3[0];
        }
        else if (a1[0] == a3[0]) {
            x = a2[0];
        }
        else {
            x = a1[0];
        }
        if (a1[1] == a2[1]) {
            y = a3[1];
        }
        else if (a1[1] == a3[1]) {
            y = a2[1];
        }
        else {
            y = a1[1];
        }

        System.out.println(x + " " + y);

    }
}