//#10872
package com.tanni.stage15;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println(result);
	}
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		else {
			return factorial(num-1)*num;
		}
	}
}
