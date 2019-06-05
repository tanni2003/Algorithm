package com.tanni.Assign;
import java.util.*;

public class Hindex {
	public static void main(String[] args) {
		int[] citations = {5, 1, 1, 1, 1};	// 1, 1, 1, 1, 5
		System.out.println(solution(citations));
	}
	public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int count = 0;
        int temp = 0;
        
        for(int i = 0; i<citations.length; i++) {
        	count = citations.length - i;
        	temp = Math.min(count, citations[i]);
        	answer = Math.max(temp, answer);
        }
        return answer;
    }
}
