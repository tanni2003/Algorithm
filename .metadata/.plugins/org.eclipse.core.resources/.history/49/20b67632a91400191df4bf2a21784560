//#2775
package com.tanni.stage8;
import java.util.Scanner;

public class NumOfResidents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int case_num = sc.nextInt();
		int result[] = new int[case_num];
		for(int i = 0; i<case_num; i++) {
			//int result[] = new int[case_num];
			int floor = sc.nextInt() + 1;
			int	room = sc.nextInt();
			int residents[][] = new int[floor][room];
			
			for(int j = 0; j<room; j++) {
				residents[0][j] = j+1;
				
			}
			
			for(int k = 1; k<floor; k++) {
				for(int l = 0; l<room; l++) {
					int iter = 0;
					if(l==0) {
						residents[k][0] = 1;
					}
					else {
					while(iter < l+1) {
					residents[k][l] += residents[k-1][iter];
					iter++;
						}
					}
				}
			}
			result[i] = residents[floor-1][room-1];
		}
		for(int j=0; j<case_num; j++) {
			System.out.println(result[j]);
		}
	}
}
