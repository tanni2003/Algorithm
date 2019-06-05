package com.tanni.Dfs;
import java.util.*;

public class TargetNum {
	static int answer = 0;
	public static void main(String[] args) {
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(solution(numbers, target));
	}
	public static int solution(int[] numbers, int target) {
        dfs(target, numbers, 0);
        return answer;
    }
	public static void dfs(int target, int[] numbers, int k) {
		if(k == numbers.length) {
			int sum = 0;
			for(int i = 0; i<numbers.length; i++) {
				sum += numbers[i];
			}
			if(sum == target) {
				answer++;
			}
			return;
		}
		else {
			numbers[k]*=1;
			dfs(target, numbers, k+1);
			
			numbers[k]*=-1;
			dfs(target, numbers, k+1);
		}
	}
}
