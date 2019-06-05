//#1932
package com.tanni.stage16;
import java.util.Scanner;

public class IntTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int[][] result = new int[n+1][n+1];
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				result[i][j] = sc.nextInt();
				
				if(j==1) {
					result[i][j] = result[i-1][j] + result[i][j];
				}
				else if(j==n) {
					result[i][j] = result[i-1][j-1] + result[i][j];
				}
				else {
					result[i][j] = Math.max(result[i-1][j-1], result[i-1][j]) + result[i][j];
				}
				if(max<result[i][j]) {
					max = result[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
