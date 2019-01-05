//#2739
package com.tanni.stage3;
import java.util.Scanner;

public class GroupOfGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
}
