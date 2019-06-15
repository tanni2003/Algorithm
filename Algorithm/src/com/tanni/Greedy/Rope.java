//#2217
package com.tanni.Greedy;
import java.util.*;

public class Rope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] rope = new int[num];
		for(int i = 0; i<num; i++) {
			rope[i] = sc.nextInt();
		}
		Arrays.sort(rope);
		System.out.println(rope(rope, num));
		
	}
	public static int rope(int[] rope, int num) {
		int answer = 0;
		
		for(int i = 0; i<rope.length; i++) {
			int temp = 0;
			temp = rope[i] * (rope.length - i); 
			if(temp > answer) {
				answer = temp;
			}
		}
		return answer;
	}
}

//[1, 5, 10, 15, 20]
//5
//20
//30
//30
//20