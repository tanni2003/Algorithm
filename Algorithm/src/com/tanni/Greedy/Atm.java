//11399
package com.tanni.Greedy;
import java.util.*;

public class Atm {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int[] time = new int[people];
		for(int i = 0; i<people; i++) {
			time[i] = sc.nextInt();
		}
		int answer = atm(time);
		System.out.println(answer);
		sc.close();
	}
	public static int atm(int[] time) {
		int answer = 0 ;
		int[] temp = new int[time.length];
		Arrays.sort(time);
		for(int i = 0; i<temp.length; i++) {
			for(int j = 0; j<=i; j++) {
				temp[i] += time[j];
			}
			answer += temp[i];
		}

		return answer;
	}
}
