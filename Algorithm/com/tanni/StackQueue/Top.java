package com.tanni.StackQueue;
import java.util.*;

public class Top {
	public static void main(String[] args) {
		int[] heights = {3,9,9,3,5,7,2};
		solution(heights);
	}
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i<heights.length; i++) {
        	stack.add(heights[i]);
        }
        
        int top = 0;
        int temp = 0;
        for(int i = heights.length-1; i>0; i--) {
        	top = (int) stack.pop();
        	for(int j = i-1; j>=0; j--) {
        		temp = heights[j];
        		if(top < temp) {
        			answer[i] = j+1;
        			break;
        		}
        		if(j == 0) {
        			answer[i] = 0;
        		}
        	}
        	
        }
        return answer;
    }
}
