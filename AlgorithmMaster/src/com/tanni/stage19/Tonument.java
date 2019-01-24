//#1057
package com.tanni.stage19;
import java.util.Scanner;

public class Tonument {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int kim = sc.nextInt();
		int lim = sc.nextInt();
		int count = 0;
		
		while(kim != lim) {
			kim = kim/2 + kim%2;
			lim = lim/2 + lim%2;
			count++;
		}
		System.out.println(count);
	}
}
