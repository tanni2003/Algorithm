package com.tanni.heap;

import java.util.*;
public class Spicy {
    public int solution(int[] scoville, int K) {
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