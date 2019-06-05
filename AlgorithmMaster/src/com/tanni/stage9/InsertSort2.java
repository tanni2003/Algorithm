//#2750
package com.tanni.stage9;
import java.util.Scanner;

public class InsertSort2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		int nums[] = new int[iter];
		for(int i = 0; i<iter; i++) {
			nums[i] = sc.nextInt();
		}
		nums = insert_sort(nums);
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}
	private static int[] insert_sort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int temp = arr[i];
			int aux = i-1;
			while(aux>=0 && temp<arr[aux]) {
				arr[aux+1] = arr[aux];
				aux--;
			}
			arr[aux+1] = temp;
		}
		return arr;	
	}
}
