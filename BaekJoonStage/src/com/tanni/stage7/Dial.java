//#5622
package com.tanni.stage7;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int time = 0;
		Map<Character,Integer> result = new HashMap<Character, Integer>();
		result.put('A', 3);
		result.put('B', 3);
		result.put('C', 3);
		result.put('D', 4);
		result.put('E', 4);
		result.put('F', 4);
		result.put('G', 5);
		result.put('H', 5);
		result.put('I', 5);
		result.put('J', 6);
		result.put('K', 6);
		result.put('L', 6);
		result.put('M', 7);
		result.put('N', 7);
		result.put('O', 7);
		result.put('P', 8);
		result.put('Q', 8);
		result.put('R', 8);
		result.put('S', 8);
		result.put('T', 9);
		result.put('U', 9);
		result.put('V', 9);
		result.put('W', 10);
		result.put('X', 10);
		result.put('Y', 10);
		result.put('Z', 10);
		
		for(int i = 0; i<input.length(); i++) {
			char dial = input.charAt(i);
			System.out.println(result.get(dial));
			time += result.get(dial);
		}
		System.out.println(time);
	}
}
