//#1924
package com.tanni.stage3;
import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = sc.nextInt();
		int m_day[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum = day;
		
		if(month!=1) {
			for(int i = 0; i<month-1; i++) {
				sum += m_day[i];
			}
		}
		
		sum = sum%7;
		
		switch(sum) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
		}
			
	}
}
