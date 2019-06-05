//#10828
package com.tanni.stage11;
import java.util.Scanner;
import java.util.Stack;

public class StackProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i<num; i++) {
			String op = sc.nextLine();
			stack(op, stack);
		}
	}
	public static void stack(String str, Stack stack) {
		String instruction[] = str.split(" ");
		
		switch(instruction[0]) {
		case "push":
			stack.push(instruction[1]);
			break;
			
		case "pop":
			if(stack.isEmpty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.pop());
			}
			break;
			
		case "size":
			System.out.println(stack.size());
			break;
			
		case "empty":
			if(stack.isEmpty()) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
			break;
			
		case "top":
			if(stack.isEmpty()) {
				System.out.println(-1);
			}
			else {
				System.out.println(stack.peek());
			}
			break;
		}
	}
}
