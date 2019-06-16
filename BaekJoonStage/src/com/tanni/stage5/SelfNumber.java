//#4673
package com.tanni.stage5;

public class SelfNumber {
	public static int check_self_num(int n) {
		int num = n;
		
		while(n>0) {
			num += n%10;
			n /= 10;
		}
		return num;
	}
	
	public static void main(String[] args) {
		boolean[] not_self = new boolean[10000];
		
		for(int i = 1; i<=10000; i++) {
			int check = check_self_num(i);
			if(check < 10000) {
				not_self[check] = true;
			}
		}
		
		for(int i=1; i<10000; i++) {
			//System.out.println(not_self[i]);
			if(!not_self[i]) {
				System.out.println(i);
			}
		}
	}
}
