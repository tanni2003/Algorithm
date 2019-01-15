//#4948
package com.tanni.stage10;
import java.util.Scanner;

public class BertrandGongjun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[246913];
		arr[0] = arr[1] = true;
		
		//에라토스테네스의 체
		for(int i = 2; (i*i)<=246913; i++) {
			if(arr[i] != true) {
				for(int j = i*i; j<=246913; j += i) {
					arr[j] = true;
				}
			}
		}
		
		while(true) {
			int num = sc.nextInt();
			if(num==0) {
				break;
			}
			System.out.println(bertrand_gongjun(num, arr));
		}
	}
	public static int bertrand_gongjun(int num, boolean[] arr) {
		int count = 0;
		
		for(int i = num+1; i<=num*2; i++) {
			if(arr[i] != true) {
				count++;
			}
		}
		return count;
	}
	
}
