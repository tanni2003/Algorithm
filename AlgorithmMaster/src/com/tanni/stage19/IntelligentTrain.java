//#2455
package com.tanni.stage19;
import java.util.Scanner;

public class IntelligentTrain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[5];
		int max = 0;
		for(int i = 1; i<=4; i++) {
			int take_off = sc.nextInt();
			int ride = sc.nextInt();
			count[i] = count[i-1] + ride - take_off;
		}
		
		for(int i = 1; i<4; i++) {
			if(count[i]<count[i+1]) {
				max = count[i+1];
			}
		}
		System.out.println(max);
	}
}
