//#2750
package com.tanni.stage9;
import java.util.Scanner;

public class InsertSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		int nums[] = new int[iter];
		for(int i = 0; i<iter; i++) {
			nums[i] = sc.nextInt();
		}
		
		if(nums.length == 1) {
			System.out.println(nums[0]);
		}
		else {
			for(int i = 1; i<=nums.length; i++) {
				for(int j = i-1; j-1>=0; j--) {
					if(nums[j-1]>nums[j]) {
						int num = nums[j-1];
						nums[j-1] = nums[j];
						nums[j] = num;
					}
				}
			}
		for(int j=0; j<nums.length; j++) {
			System.out.println(nums[j]);
			}
		}
	}
}