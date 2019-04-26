package com.tanni.Greedy;
import java.util.*;

public class BiggestNum {
	public static void main(String[] args) {
		String number = "4177252841";	//10
		int k = 4;
		System.out.println(solution(number, k));
	}
	public static String solution(String number, int k) {
        int idx = 0;
        char max;
        StringBuilder answer = new StringBuilder();
        
        if(number.charAt(0)=='0') return "0";
        for(int i = 0; i<number.length() - k; i++) {	//0, 1, 2, 3, 4, 5
        	max = '0';

        	for(int j = idx; j<=k + i; j++) {	//2, 3, 5, 6, 7, 9
        		if(max < number.charAt(j)) {
        			max = number.charAt(j);
        			idx = j+1;
        			System.out.println(max);
        		}
        	}
        	answer.append(max);
        	//System.out.println(answer);
        }
        return answer.toString();
    }
}
