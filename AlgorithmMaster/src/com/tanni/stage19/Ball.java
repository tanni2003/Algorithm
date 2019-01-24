//#1547
package com.tanni.stage19;
import java.util.Scanner;

public class Ball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] cup = new int[4];
		cup[1] = 1;
		int count = 1;
		for(int i = 0; i<num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp = cup[a];
			cup[a] = cup[b];
			cup[b] = temp;
		}
		while(true) {
			if(cup[count]==1) {
				System.out.println(count);
				break;
			}
			count++;
		}
	}
}
