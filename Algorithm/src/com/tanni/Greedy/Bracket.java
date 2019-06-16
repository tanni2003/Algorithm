//#1541
package com.tanni.Greedy;
import java.util.*;

public class Bracket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.println(bracket(input));
	}
	public static int bracket(String input) {
		String[] num = input.split("-");
		int answer = 0;
		
		for(int i = 0; i<num.length; i++) {
			String[] temp1 = num[i].split("\\+");
			int temp2 = 0;
			
			for(int j = 0; j<temp1.length; j++) {
				temp2 += Integer.parseInt(temp1[j]);
			}
			
			if(i == 0) {
				temp2 *= (-1);
			}
			answer -= temp2;
		}
		return answer;
	}
}
