//#11047
package com.tanni.Greedy;
import java.util.*;

public class Coin {
	static int num;
	static int money;
	static int answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		money = sc.nextInt();
		int[] coin = new int[num];
		for(int i = 0; i<num; i++) {
			coin[i] = sc.nextInt();
		}
		answer = coin(coin);
		System.out.println(answer);
	}
	public static int coin(int[] coin) {
		int temp = coin.length - 1;

		while(true) {
			if(money == 0) {
				break;
			}
			else if(coin[temp]<=money) {
				money -= coin[temp];
				answer++;

				continue;
			}
			temp--;
		}
		
		return answer;
	}
}
