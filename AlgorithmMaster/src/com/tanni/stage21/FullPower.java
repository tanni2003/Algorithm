//#1977
package com.tanni.stage21;
import java.util.Scanner;

public class FullPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = (int) Math.ceil(Math.sqrt(M));
		for(int i = min; i<=Math.floor(Math.sqrt(N)); i++) {
			sum += Math.pow(i,2);
		}
		if(sum>0) {
			System.out.println(sum);
			System.out.println((int)Math.pow(min, 2));
		}
		else {
			System.out.println(-1);
		}
	}
}
