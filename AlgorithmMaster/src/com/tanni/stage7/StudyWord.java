//#1157
package com.tanni.stage7;
import java.util.Scanner;

public class StudyWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();
		int result[] = new int[26];
		int max=0;
		char answer = 0;
		
		for(int i=0; i<word.length(); i++) {
			result[word.charAt(i)-65]++;
			if(result[word.charAt(i)-65] > max) {
				max = result[word.charAt(i)-65];
				answer = word.charAt(i);
			}
			else if(max == result[word.charAt(i)-65]) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}