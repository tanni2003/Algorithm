package com.tanni.hash;

public class PhoneNum {
	
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(solution(phone_book));
		
	}
	
	public static Boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i<phone_book.length-1; i++) {
        	for(int j = i+1; j<phone_book.length; j++) {
        		if(phone_book[j].startsWith(phone_book[i]) || phone_book[i].startsWith(phone_book[j])) {
        			answer = false;
        			break;
        		}
        	}
        }
        return answer;
    }
}

