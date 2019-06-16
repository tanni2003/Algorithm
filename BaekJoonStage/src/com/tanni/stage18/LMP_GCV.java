//#2609
package com.tanni.stage18;
import java.util.Scanner;

public class LMP_GCV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int low = Math.min(a, b);
		int gcv = 0;
		for(int i = 1; i<=low; i++) {
			if(a%i==0 && b%i==0) {
				gcv = i;
			}
		}
		System.out.println(gcv);
		System.out.println(a*b/gcv);
	}
}
