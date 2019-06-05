//#1003
package com.tanni.stage16;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case_num = sc.nextInt();
		int[][] result = new int[41][2];
		result[0][0] = 1;
		result[1][1] = 1;
		for(int i = 2; i<41; i++) {
			for(int j = 0; j<2; j++) {
				result[i][j] = result[i-1][j] + result[i-2][j];
			}
		}
		for(int i = 0; i<case_num; i++) {
			int num = sc.nextInt();
			System.out.println(result[num][0] + " " + result[num][1]);
		}
	}
}
