//#11718
package com.tanni.stage1;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String new_line = sc.nextLine();
			System.out.println(new_line);
		}
		sc.close();
	}
}