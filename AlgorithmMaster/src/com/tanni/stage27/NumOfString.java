//#11478
package com.tanni.stage27;
import java.util.Scanner;

public class NumOfString {
	public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count = 0;
        
        for(int i = str.length() - 1; i>=0; i--) {
        	for(int j = i; j<str.length(); j++) {
        		String temp1 = str.substring(i+1);
        		String temp2 = str.substring(i, j+1);
        		if(temp1.contains(temp2)) {
        			continue;
        		}
        		else {
        			count++;
        		}
        	}
        }
        System.out.print(count);
	}
}
