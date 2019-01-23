//#1149
package com.tanni.stage16;
import java.util.Scanner;

public class RGBDistance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] rgb = new int[num][3];
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<3; j++) {
				rgb[i][j] = sc.nextInt();
			}
		}
		int[][] temp = new int[num][3];
		temp[0][0] = rgb[0][0];
		temp[0][1] = rgb[0][1];
		temp[0][2] = rgb[0][2];
		
		//각 집이 R,G,B인 경우마다 최소값을 구한다.
		for(int i = 1; i<num; i++) {
			temp[i][0] = Math.min(temp[i-1][1], temp[i-1][2]) + rgb[i][0];
			temp[i][1] = Math.min(temp[i-1][0], temp[i-1][2]) + rgb[i][1];
			temp[i][2] = Math.min(temp[i-1][0], temp[i-1][1]) + rgb[i][2];
		}
		int min = Math.min(Math.min(temp[num-1][0],temp[num-1][1]), temp[num-1][2]);
		System.out.println(min);
	}
}
