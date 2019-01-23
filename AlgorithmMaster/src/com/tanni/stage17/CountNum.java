//#2577
package com.tanni.stage17;
import java.util.Scanner;

public class CountNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		for(int i = 0; i<3; i++) {
			num *= sc.nextInt();
		}
		String[] nums = Integer.toString(num).split("");
		int[] count = new int[10];
		
		for(int i = 0; i<nums.length; i++) {
			switch(nums[i]) {
			case "0":
				count[0]++;
				break;
			case "1":
				count[1]++;
				break;
			case "2":
				count[2]++;
				break;
			case "3":
				count[3]++;
				break;
			case "4":
				count[4]++;
				break;
			case "5":
				count[5]++;
				break;
			case "6":
				count[6]++;
				break;
			case "7":
				count[7]++;
				break;
			case "8":
				count[8]++;
				break;
			case "9":
				count[9]++;
				break;
			}

		}
		for(int i = 0; i<10; i++) {
			System.out.println(count[i]);
		}
	}
}
