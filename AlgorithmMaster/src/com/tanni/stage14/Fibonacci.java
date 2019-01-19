//#2747
package com.tanni.stage14;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] result = new int[num+1];
		result[0] = 0;
		result[1] = 1;
		
		for(int i = 2; i<num+1; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		System.out.println(result[num]);
	}
}
