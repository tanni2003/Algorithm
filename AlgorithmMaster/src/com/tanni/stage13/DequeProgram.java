//#10866
package com.tanni.stage13;
import java.util.*;

public class DequeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Deque<String> deque = new ArrayDeque<String>();
		for(int i = 0; i<=num; i++) {
			String str = sc.nextLine();
			deque(str, deque);
		}
	}
	public static void deque(String str, Deque deque) {
		
		String[] insert = str.split(" ");
		
		switch(insert[0]) {
		case "push_front":
			deque.addFirst(insert[1]);
			break;
		case "push_back":
			deque.addLast(insert[1]);
			break;
		case "pop_front":
			if(deque.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(deque.removeFirst());
				break;
			}
		case "pop_back":
			if(deque.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(deque.removeLast());
				break;
			}
		case "size":
			System.out.println(deque.size());
			break;
		case "empty":
			if(deque.isEmpty()) {
				System.out.println(1);
				break;
			}
			else {
				System.out.println(0);
				break;
			}
		case "front":
			if(deque.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(deque.getFirst());
				break;
			}
		case "back":
			if(deque.isEmpty()) {
				System.out.println(-1);
				break;
			}
			else {
				System.out.println(deque.getLast());
				break;
			}
		}
	}
}
