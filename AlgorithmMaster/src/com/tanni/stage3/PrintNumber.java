//#2742
package com.tanni.stage3;
import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = a; i>0; i--) {
			System.out.println(i);
		}
	}
}
