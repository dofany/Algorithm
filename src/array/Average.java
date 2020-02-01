package array;

import java.util.*;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i =0; i<c; i++) {
			int n = sc.nextInt();
			
			int sumScore = 0;
			int[] studentArray = new int[n];
			int averageScore = 0;
			double superiorStudent = 0;
			for(int j=0; j<n; j++) {
				int score = sc.nextInt();
				sumScore += score;
				studentArray[j] = score;
			}
			averageScore = sumScore/n;
			for(int k = 0; k<studentArray.length; k++) {
				if(studentArray[k] > averageScore) {
					superiorStudent++;
				}
			}
			double output = (superiorStudent/n)*100;
			System.out.printf("%.3f", output);
			System.out.println("%");
		}
    }
}