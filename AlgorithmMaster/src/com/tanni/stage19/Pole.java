//#1094
package com.tanni.stage19;
import java.util.Scanner;

public class Pole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int length = 64;
		int count = 0;

		while(x>0) {
			if(length>x) {
				length /= 2;
			}
			else {
				x -= length;
				count++;
			}
		}
		System.out.println(count);
	}
}
