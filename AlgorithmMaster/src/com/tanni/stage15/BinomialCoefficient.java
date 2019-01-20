//#11050
package com.tanni.stage15;
import java.util.Scanner;

public class BinomialCoefficient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = binomial_coeff(n) / (binomial_coeff(k) * binomial_coeff(n-k));
		System.out.println(result);
	}
	public static int binomial_coeff(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return binomial_coeff(n-1) * n;
		}
	}
}
