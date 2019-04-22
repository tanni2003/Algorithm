package com.tanni.heap;
import java.util.*;

public class Noodle {
	public static void main(String[] args) {
		int stock = 4;
		int[] dates = {4,10,15};
		int[] supplies = {20,5,10};
		int k = 30;
		System.out.println(solution(stock, dates, supplies,k));
	}
	public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<Integer> (supplies.length);
        
        while(k<=0) {
        	k -= stock;
        	for(int i = 0; i<dates.length; i++) {
        		System.out.println(queue.poll());
        	}
        }
        return answer;
    }
}
