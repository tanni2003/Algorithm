package com.tanni.Greedy;
import java.util.*;

public class GymSuit {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		System.out.println(solution(n, lost, reserve));
	}
	public static int solution(int n, int[] lost, int[] reserve) {
        int okMember = n - lost.length;
        List<Integer> lost_member = new ArrayList<Integer>();
        List<Integer> reserve_member = new ArrayList<Integer>();
        
        for(int i: lost) {
        	lost_member.add(i);
        }
        for(int i : reserve) {
        	reserve_member.add(i);
        }
        for(int i = 0; i<lost_member.size(); i++) {
        	for(int j = 0; j<reserve_member.size(); j++) {
        		if(lost_member.get(i) == reserve_member.get(j)) {
        			okMember++;
            		reserve_member.remove(j);
            		lost_member.remove(i);
            		break;
            	}
        	}
        }
        for(int i = 0; i<lost_member.size(); i++) {
        	int lostNum = lost_member.get(i);
        	for(int j = 0; j<reserve_member.size(); j++) {
        		int reserveNum = reserve_member.get(j);
        		if(lostNum == reserveNum || lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
        			okMember++;
        			reserve_member.remove(j);
        			//lost_member.remove(i);
        			break;
        		}
        	}
        }
        return okMember;
    }
}