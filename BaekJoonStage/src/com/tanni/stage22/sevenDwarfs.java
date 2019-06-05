//#2309
package com.tanni.stage22;
import java.util.Scanner;
import java.util.Arrays;

public class sevenDwarfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dwarfs = new int[9];
		for(int i = 0; i<9; i++) {
			dwarfs[i] = sc.nextInt();
		}
		Arrays.sort(dwarfs);
		
		int sum = 0;
		for(int i = 0; i<9; i++) {
			sum += dwarfs[i];
		}

		int[] result = new int[2];
		result = find(sum, dwarfs);
		
		for(int i = 0; i<9; i++) {
			if(i != result[0] && i!= result[1]) {
				System.out.println(dwarfs[i]);
			}
		}
	}
	public static int[] find(int sum, int[] dwarfs) {
		int[] result = new int[2];
		int temp = 0;
		while(true) {
			for(int i = 0; i<8; i++) {
				result[0] = i;
				for(int j = i+1; j<9; j++) {
					temp = sum;
					result[1] = j;
					temp -= (dwarfs[i] + dwarfs[j]);
					if(temp == 100) {
						return result;
					}
				}
			}
		}
	}
}
