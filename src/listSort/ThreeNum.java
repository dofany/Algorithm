package listSort;

import java.util.*;
import java.io.*;

public class ThreeNum {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i< 3; i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        for(int value : arr){
            sb.append(value).append(' ');
        }
        System.out.print(sb+" ");

    }
}
