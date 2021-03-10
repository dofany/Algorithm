package listSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class ThreeNum {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i<3; i++){
            num.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(num);
        for(int i = 0; i<num.size(); i++){
            System.out.println(num.get(i));
        }

    }
}
