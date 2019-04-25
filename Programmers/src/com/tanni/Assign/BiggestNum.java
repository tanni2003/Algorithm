package com.tanni.Assign;
import java.util.*;

public class BiggestNum {
	public static void main(String[] args) {
		int[] numbers = {6, 10, 2};
		System.out.println(solution(numbers));
	}
	public static String solution(int[] numbers) {
        String answer = "";
        String [] num = new String[numbers.length];
        
        for(int i = 0; i<numbers.length; i++) {
        	num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new Comp());
        if(num[0].equals("0")) {
        	answer += "0";
        }
        else {
        	for(int j = 0; j<num.length; j++) {
        		answer += num[j];
        	}
        }
        return answer;
    }
}

class Comp implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return (o2+o1).compareTo(o1+o2);
	}
	
}