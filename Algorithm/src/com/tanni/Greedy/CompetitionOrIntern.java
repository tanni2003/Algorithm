//#2875
package com.tanni.Greedy;
import java.util.*;

public class CompetitionOrIntern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int girl = sc.nextInt();
		int boy = sc.nextInt();
		int intern = sc.nextInt();
		System.out.println(solution(girl, boy, intern));
	}
	public static int solution(int girl, int boy, int intern) {
		int answer = 0;
		int team_max = Math.min(girl/2, boy);
		int temp = (girl - team_max*2) + (boy - team_max);
		if(temp >= intern) {
			answer = team_max;
		}
		else {
			while(temp < intern) {
				team_max--;
				temp += 3;
			}
			answer = team_max;
		}
		return answer;
	}
}