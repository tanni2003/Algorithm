package com.tanni.hash;

import java.util.*;

public class MarathonPlayer {
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		solution(participant, completion);
	}
	
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            if(map.get(name) == null) {	//참가자(key)와 1(value)를 저장
                map.put(name, 1);
            } else {	//동명이인인 경우 value+1 저
                int value = map.get(name) + 1;
                map.put(name, value);
            }
        }

        for (String name : completion) {	//완주한 선수는 value를 0으로 저장
            int value = map.get(name) - 1;
            map.put(name, value);
        }

        for (String name : map.keySet()) {	//value가 0인 선수 찾기
            if(map.get(name) == 1) answer = name;
        }
        
        return answer;
    }
	

}
