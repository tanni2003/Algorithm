package com.tanni.hash;
import java.util.*;

public class Cloth {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(clothes));
	}
	public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        int val = 0;
        
        for(int i = 0; i<clothes.length; i++) {
        	if(map.containsKey(clothes[i][1])) {
        		map.put(clothes[i][1],1);
        	}
        	else {
        		val = map.get(clothes[i][1]) + 1;
        		map.put(clothes[i][1], val);
        	}
        }

        for(String name: map.keySet()) {
        	answer *= (map.get(name)+1);
        }

        return answer-1;
    }
}
