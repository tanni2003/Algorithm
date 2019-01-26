//#2231
package com.tanni.stage22;
import java.util.Scanner;

public class DecompositionSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String temp = String.valueOf(num-1);
		String result = "0";

		while(true) {
			int sum = Integer.parseInt(temp);

			for(int i = 0; i<temp.length(); i++) {
				sum += temp.charAt(i) - '0';
			}
			
			if(sum == num) {
				result = temp;
			}

			temp = String.valueOf(Integer.parseInt(temp) - 1);
			
			if(Integer.parseInt(temp) == 0) {
				break;
			}
		}
		System.out.println(result);
	}
}