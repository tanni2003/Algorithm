//#2902
package com.tanni.stage27;
import java.util.Scanner;

public class KMP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String initial = Character.toString(name.charAt(0));
		
		for(int i = 1; i<name.length(); i++) {
			if(name.charAt(i) == '-') {
				initial += name.charAt(i+1);
			}
		}
		System.out.println(initial);
	}
}
