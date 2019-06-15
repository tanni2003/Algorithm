//#1120
package com.tanni.Greedy;
import java.util.*;

public class StringIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int num = b.length() - a.length();
		System.out.println(string(a, b, num));
	}
	public static int string(String a, String b, int num) {
		int min = a.length();
		
		for(int i = 0; i<num+1; i++) {
			int diff = 0;
			String temp_b = b.substring(i, i+a.length());
			
			for(int j = 0; j<a.length(); j++) {
				if(a.charAt(j) != temp_b.charAt(j)) {
					diff++;
				}
			}
			if(diff < min) {
				min = diff;
			}
		}
		return min;
	}
}