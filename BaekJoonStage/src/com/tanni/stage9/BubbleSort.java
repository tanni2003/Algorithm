//#2750
package com.tanni.stage9;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input_num = sc.nextInt();
		int[] num = new int[input_num];
		
		for(int i = 0; i<input_num; i++) {
			num[i] = sc.nextInt();
		}
		num = bubble_sort(num);
		for(int i = 0; i<input_num; i++) {
			System.out.println(num[i]);
		}
	}
	private static int[] bubble_sort(int[] arr) {
		int temp = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1; j<arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
}
