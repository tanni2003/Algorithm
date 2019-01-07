//#1152
package com.tanni.stage6;
import java.util.Scanner;


public class NumberOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력된 문자열 앞뒤에 공백이 포함된 경우를 위해 trim()함수 사용 
		String word = sc.nextLine().trim();
		String[] sentence = word.split(" ");
		if(word.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(sentence.length);
		}
	}
}