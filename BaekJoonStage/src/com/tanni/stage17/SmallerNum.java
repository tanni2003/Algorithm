//#10871
package com.tanni.stage17;
import java.util.Scanner;

public class SmallerNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		int[] scan = new int[num];
		String result = "";
		for(int i = 0; i<num; i++) {
			scan[i] = sc.nextInt();
		}
		for(int i = 0; i<num; i++) {
			if(x>scan[i]) {
				result += scan[i] + " ";
				count++;
			}
		}
		System.out.println(result.trim());
	}
}
