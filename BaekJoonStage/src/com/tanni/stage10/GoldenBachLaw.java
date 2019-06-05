//#9020
package com.tanni.stage10;
import java.util.Scanner;

public class GoldenBachLaw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean[] arr = new boolean[10001];
		arr[0] = arr[1] = true;
		
		//에라토스테네스의 체
		for(int i = 2; (i*i)<=10000; i++) {
			if(arr[i]!=true) {
				for(int j = (i*i); j<=10000; j+=i) {
					arr[j] = true;
				}
			}
		}
		for(int i = 0; i<num; i++) {
			int[] result = new int[2];
			int input = sc.nextInt();
			result = golden_bach(input, arr);
			System.out.print(result[0]);
			System.out.print(" ");
			System.out.println(result[1]);
		}
		
	}
	public static int[] golden_bach(int num, boolean[] arr) {
		int left =num/2;
		int right =num/2;
		int[] result = new int[2];
		
		while(true) {
			result[0] = left;
			result[1] = right;
			
			if(!arr[left] && !arr[right]) {
				break;
			}
			else {
				left--;
				right++;
			}
		}
		return result;
	}
}
