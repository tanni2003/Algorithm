//#2292
package com.tanni.stage8;
import java.util.Scanner;

public class BulkHouse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num_room = 0;
		
		num_room = solution(input);
		System.out.println(num_room);
	}
	
	private static int solution(int input) {
		int num_room = 1;
		int num = 2;
		
		if(input == 1) return num_room;
		
		while(num<=input) {
			num += 6*num_room;
			num_room++;
		}
		return num_room;
	}
}
