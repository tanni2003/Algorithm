//#2920
package com.tanni.stage6;
import java.util.Scanner;
import java.util.Arrays;

public class AscDscMixed {
	public static void main(String[] args) {
		int Asc[] = {1,2,3,4,5,6,7,8};
		int Dsc[] = {8,7,6,5,4,3,2,1};
		
		Scanner sc = new Scanner(System.in);
		int scale[] = new int[8];
		
		for(int i=0; i<8; i++) {
			int input = sc.nextInt();
			scale[i] = input;
		}
		sc.close();
		
		if(Arrays.equals(scale, Asc)) {
			System.out.println("ascending");
		}
		else{
			if(Arrays.equals(scale, Dsc)){
				System.out.println("descending");
				}
			else {
				System.out.println("mixed");
				}
		}
		
		for(int i = 0; i<8; i++) {
			System.out.println(scale[i]);
			System.out.println(Asc[i]);
		}
	}
}
