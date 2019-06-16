package com.tanni.bruteforce;
import java.util.*;

public class MockExam {
	public static void main(String[] args) {
		int[] answers = {1, 3, 2, 4, 2};
		solution(answers);
	}
	public static int[] solution(int[] answers) {
        int[] temp = new int[3];
        int[] supo = new int[3];

        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int[] supo2 = {1, 3, 4, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int j = 0;
        int k = 0;
        
        for(int i = 1; i<answers.length+1; i++) {
        	if(i %5 == 0) temp1 = 5;       	
        	else temp1 = i%5;

        	if(i%2 == 1) temp2 = 2;
        	else{
        		j %= 4;
        		temp2 = supo2[j++];
        	}
        	
        	k %= 10;
        	temp3 = supo3[k++];
        	
        	if(temp1 == answers[i-1]) temp[0]++;
        	
        	if(temp2 == answers[i-1]) temp[1]++;
        	
        	if(temp3 == answers[i-1]) temp[2]++;
        }
        
        int max = Math.max(temp[0], Math.max(temp[1], temp[2]));
        
        int count = 0;
        for(int i = 0; i<3; i++) {
        	if(temp[i] == max) {
        		count++;
        	}
        }
        
        int[] answer = new int[count];
        int l = 0;
        for(int i = 0; i<3; i++) {
        	if(temp[i] == max) {
        		answer[l++] =	i + 1;
        	}
        }
        
        return answer;
    }
}
