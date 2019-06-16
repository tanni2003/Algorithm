//#1475
package com.tanni.stage8;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.Arrays;

public class RoomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		HashMap<Integer, Integer> check_num = new HashMap<Integer, Integer>();
		String[] number = input.split("");
		int[] nums = Arrays.stream(number).mapToInt(Integer::parseInt).toArray();

		for(int i = 0; i<9; i++) {
			check_num.put(i, 0);
		}
		
		for(int i = 0; i<number.length; i++) {
			int num = (int)nums[i];
			if(num == 9) {
				num = 6;
			}
			int a = check_num.get(num)+1;
			check_num.put(num, a);
		}
		
		int six_num = (int) Math.ceil(check_num.get(6)/2.0);
		check_num.put(6, six_num);
		int max = Collections.max(check_num.values());
		System.out.println(max);
		
	}
}
