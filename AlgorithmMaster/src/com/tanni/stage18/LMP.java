//#1934
package com.tanni.stage18;
import java.util.Scanner;

public class LMP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			int low = Math.min(first, second);
			int gcv = 0;
			for(int j = 1; j<=low; j++) {
				if(first%j==0 && second%j==0) {
					gcv = j;
				}
			}
			System.out.println(first*second/gcv);
		}
	}
}
