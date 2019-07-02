//#1080
package com.tanni.Greedy;
import java.util.*;

public class RowColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] row_col = new char[n][m];
		boolean[][] check = new boolean[n][m];

		for(int i = 0; i<n; i++) {
			row_col[i] = sc.next().toCharArray();
		}
		
		int diff = 0;
		for(int i = 0; i<n; i++) {
			char[] temp = sc.next().toCharArray();
			for(int j = 0; j<m; j++) {
				if(temp[j] != row_col[i][j]) {
					check[i][j] = true;
					diff++;
				}
			}
		}
		if(diff == 0) {
			System.out.println(0);
		}
		else {
			System.out.println(row_col(check));
		}
	}
	public static int row_col(boolean[][] check) {
		int answer = 0;
		int n = check.length;
		int m = check[0].length;
		
		if(n <3 || m < 3) {
			return -1;
		}

		for(int i = 0; i<=n-3; i++) {
			for(int j = 0; j<=m-3; j++) {
				if(i == n-3 && !(check[i][j] == check[i+1][j] && check[i][j] == check[i+2][j])) {
					return -1;
				}
				if(j == m-3 && !(check[i][j] == check[i][j+1] && check[i][j] == check[i][j+2])) {
					return -1;
				}
				
				if(check[i][j]) {
					reverse(check, i, j);
					answer++;
				}
			}
		}
		
		boolean flag = check[n-3][m-3];
		for (int i = n - 1; i > n - 3; i--) {
			for (int j = m - 1; j > m - 3; j--) {
				if (flag != check[i][j]) return -1;
				}
			}
		
		return answer;
	}
	static void reverse(boolean[][] check, int x, int y) {
		for(int i = x; i<x+3; i++) {
			for(int j = y; j<y+3; j++) {
				check[i][j] = !check[i][j];
			}
		}
	}
}