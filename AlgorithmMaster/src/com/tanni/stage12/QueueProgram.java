//#10845
package com.tanni.stage12;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class QueueProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int last = 0;
		
		Queue<String> queue = new LinkedList<String>();
		for(int i = 0; i<num; i++) {
			String str = sc.nextLine();
			last = queue(str, queue, last);
		}
	}
	public static int queue(String str, Queue queue, int last) {
		String[] input = str.split(" ");
		
		switch(input[0]) {
		case "push":
			queue.offer(input[1]);
			last = Integer.parseInt(input[1]);
			break;
		
		case "pop":
			if(queue.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(queue.poll());
				break;
			}
			
		case "size":
			System.out.println(queue.size());
			break;
		
		case "empty":
			if(queue.isEmpty()) {
				System.out.println(1);
				break;
			}
			else {
				System.out.println(0);
				break;
			}
		
		case "front":
			if(queue.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(queue.peek());
				break;
			}
			
		case "back":
			if(queue.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(last);
				break;
			}
		}
		return last;
	}
}
