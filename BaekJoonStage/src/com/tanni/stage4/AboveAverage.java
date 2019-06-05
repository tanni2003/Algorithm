//#4344
package com.tanni.stage4;
import java.util.Scanner;

public class AboveAverage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int case_num = sc.nextInt();
		double average;
		int sum,count,iter;
		int score[] = new int[1000];
		
		for(int i = 0; i<case_num; i++) {
			
			iter = sc.nextInt();
			sum = 0;
			count = 0;
			
			for(int j = 0; j<iter; j++) {
				score[j] = sc.nextInt();
				sum += score[j];}
			
			average = (double)sum/iter;
			
			for(int k =0; k<iter; k++) {
				if(score[k]>average) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / iter);
			System.out.println("%");
		}
		sc.close();
	}
}
