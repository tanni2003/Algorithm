package com.tanni.Assign;
import java.util.*;

public class KthNum2 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		solution(array, commands);
	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start = 0;
        int end = 0;
        int k = 0;
        
        for(int i = 0; i<commands.length; i++) {
        	start = commands[i][0];
        	end = commands[i][1];
        	k = commands[i][2];
        	
        	int[] temp = new int[end - start +1];
        	int a = 0;
        	for(int j = start - 1; j<end; j++) {
        		temp[a++] = array[j];
        	}
        	Arrays.sort(temp);
        	answer[i] = temp[k-1];
        }
        return answer;
    }
}
