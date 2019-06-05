//#1978
package com.tanni.stage10;
import java.util.Scanner;

public class FindDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i<num; i++) {
			nums[i] = sc.nextInt();
		}
		int result = num - find_no_decimal(nums);
		System.out.println(result);
	}
	public static int find_no_decimal(int[] arr) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			int num = arr[i];
			if(num==1) {
				count++;
			}
			else if(num%2==0 & num!=2) {
				count++;
			}
			else {
				for(int k = 3; k<num; k++) {
					if(num%k==0) {
						count++;
						k = num;
					}
				}
			}
		}
		return count;
	}
}
