//#8958
package com.tanni.stage6;
import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum, score;
		
		for(int i=0; i<num; i++) {
			String answer = sc.next();
			String[] ox = answer.split("");
			sum = 0;
			score=0;
			
			for(int j=0; j<ox.length; j++) {
				if(ox[j].equals("O")) {
					++score;
					sum += score;
					System.out.println(ox[j]);
				}
				else {
					score = 0;
				}
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
