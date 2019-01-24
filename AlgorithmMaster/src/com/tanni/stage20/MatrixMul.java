//#2740
package com.tanni.stage20;
import java.util.Scanner;

public class MatrixMul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a_row = sc.nextInt();
		int a_col = sc.nextInt();
		int[][] a = new int[a_row][a_col];
		for(int i = 0; i<a_row; i++) {
			for(int j = 0; j<a_col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int b_row = sc.nextInt();
		int b_col = sc.nextInt();
		int[][] b = new int[b_row][b_col];
		for(int i = 0; i<b_row; i++) {
			for(int j = 0; j<b_col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int result[][] = new int[a_row][b_col];
		
		for(int i = 0; i<a_row; i++) {
			for(int j = 0; j<b_col; j++) {
				int sum = 0;
				for(int k = 0; k<a_col; k++) {
					sum += a[i][k]*b[k][j];
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		
	}
}
