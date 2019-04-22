package com.tanni.heap;
import java.util.*;
public class Spicy {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		System.out.println(solution(scoville, 7));
	}
	public static int solution(int[] scoville, int K) {
        int answer = -1;
        Queue<Integer> queue = new PriorityQueue<Integer> (scoville.length);
        for(int i = 0; i<scoville.length; i++) {
        	queue.add(scoville[i]);
        }
        int temp1 = 0;
        int temp2 = 0;
        int sum = 0;
        int time = 0;
        while(queue.size()>1) {
        	temp1 = queue.poll();
        	System.out.println(temp1);
        	if(temp1>=K) {
        		answer = time;
        		break;
        	}
        	temp2 = queue.poll();
        	sum = temp1 + temp2*2;
        	queue.add(sum);
        	time++;
        }
        if(queue.peek() >= K) {
        	answer = time;
        }
        
        return answer;
    }
}
