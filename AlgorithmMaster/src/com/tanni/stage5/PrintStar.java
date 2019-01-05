//#2448
package com.tanni.stage5;
import java.util.Scanner;

public class PrintStar {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String star[] = new String[n];
		star[0] = "  *  ";
		star[1] = " * * ";
		star[2] = "*****";
		
		for(int k = 1; 3 * Math.pow(2, k)<=n; ++k) {
			print_star(k, star);
		}
		for(int i=0; i<n; ++i) {
			System.out.println(star[i]);
		}
	}
	
	public static void print_star(int k, String star[]) {
		int bottom = 3 * (int)Math.pow(2, k);
		int mid = bottom/2;
		
		for(int i = mid; i<bottom; ++i) {
			star[i] = star[i - mid] + " " + star[i - mid];
		}
		
		String space = "";
		while(space.length()<mid) {
			space += " ";
		}
		for(int i=0; i<mid; ++i) {
			star[i] = space + star[i] + space;
		}
	}
}
